package com.example.domain.service;

import com.example.domain.model.OrderDto;

public interface OrderService {
    Long addOrder(OrderDto orderDto);

    OrderDto updateOrder(OrderDto orderDto);

    void deleteOrder(Long orderId);
}
