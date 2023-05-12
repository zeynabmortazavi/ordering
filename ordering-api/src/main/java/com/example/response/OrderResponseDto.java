package com.example.response;

import lombok.Data;

@Data
public class OrderResponseDto {
    private Long id;

    public OrderResponseDto(Long id) {
        this.id = id;
    }
}
