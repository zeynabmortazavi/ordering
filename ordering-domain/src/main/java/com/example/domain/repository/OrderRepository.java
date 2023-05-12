package com.example.domain.repository;

import com.example.domain.model.OrderDto;

public interface OrderRepository {
    void save(OrderDto orderDto);
}
