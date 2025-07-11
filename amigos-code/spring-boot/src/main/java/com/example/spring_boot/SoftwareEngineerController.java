package com.example.spring_boot;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping()
    public List<SoftwareEngineer> getEngineers() {
//        return List.of(
//                new SoftwareEngineer(
//                        1,
//                        "James",
//                        "js, node, react, tailwindcss"
//                ),
//                new SoftwareEngineer(
//                        2,
//                        "Jai",
//                        "js, node"
//                ),
//                new SoftwareEngineer(
//                        3,
//                        "Jalaal",
//                        "js, react"
//                )
//        );

        return softwareEngineerService.getAllSoftwareEngineers();
    }

    @GetMapping("{id}")
    public SoftwareEngineer getEngineerById(
            @PathVariable Integer id
    ) {
    return softwareEngineerService.getSoftwareEngineerById(id);
    }

    @PostMapping()
    public void addNewSoftwareEngineer(
            SoftwareEngineer softwareEngineer
    ) {
        softwareEngineerService.insertSoftwareEngineer(softwareEngineer);
    }
}
