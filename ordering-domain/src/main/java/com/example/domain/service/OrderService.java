package com.example.domain.service;

import com.example.domain.model.OrderDto;

public interface OrderService {
    Long addOrder(OrderDto orderDto);
}
