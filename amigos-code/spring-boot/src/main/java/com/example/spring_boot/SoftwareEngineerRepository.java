package com.example.spring_boot;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SoftwareEngineerRepository
        extends JpaRepository<SoftwareEngineer, Integer> {

}
