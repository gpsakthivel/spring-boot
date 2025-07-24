package io.javabrains.spring_security_jwt.service;

import io.javabrains.spring_security_jwt.model.User;
//import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

    private final String SECRET_KEY = "2eab894789010a3626b646938090f0e8c18d1f91ce96d945d62ef108d7908a7b";

    public String generateToken(User user) {
//        String token = Jwts
//                .builder()
//                .subject(user.getUsername());
        return "";
    }
}
