package com.example.order_service.controller;

import com.example.order_service.dto.OrderResponseDTO;
import com.example.order_service.dto.ProductDTO;
import com.example.order_service.entity.Order;
import com.example.order_service.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private WebClient.Builder webClientBuilder;

    // create a method to place order
    @PostMapping("/placeOrder")
    public Mono<ResponseEntity<OrderResponseDTO>> placeOrder(@RequestBody Order order) {
        return webClientBuilder.build().get().uri("http://localhost:8081/products/" + order.getProductId()).retrieve()
                .bodyToMono(ProductDTO.class).map(productDTO -> {
                    OrderResponseDTO responseDTO = new OrderResponseDTO();

                    responseDTO.setProductId(order.getProductId());
                    responseDTO.setQuantity(order.getQuantity());

                    // set product details
                    responseDTO.setProductName(productDTO.getName());
                    responseDTO.setProductPrice(productDTO.getPrice());
                    responseDTO.setTotalPrice(order.getQuantity() * productDTO.getPrice());

                    // save order details to DB
                    orderRepository.save(order);
                    responseDTO.setOrderId(order.getId());
                    return ResponseEntity.ok(responseDTO);
                });
    }

    // get all order
    @GetMapping
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
