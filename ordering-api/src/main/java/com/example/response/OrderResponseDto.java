package com.example.response;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderResponseDto {
    private Long id;
    private String name;
    private BigDecimal price;
    public OrderResponseDto() {
    }
    public OrderResponseDto(Long id) {
        this.id = id;
    }
}
