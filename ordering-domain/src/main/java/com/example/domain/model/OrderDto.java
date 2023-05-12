package com.example.domain.model;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class OrderDto {
    private Long id;
    private String name;
    private BigDecimal price;
}