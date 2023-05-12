package com.example.repository;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = JpaOrderRepository.class)
@EntityScan(basePackages = "com.example.entity")
@Configuration
public class DBConfiguration {
}
