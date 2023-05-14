package com.example.domain.repository;

import com.example.domain.model.OrderDto;

public interface OrderRepository {
    void save(OrderDto orderDto);
    OrderDto update(OrderDto orderDto);
    void deleteOrder(Long orderId);

    OrderDto getOrderById(Long orderId);
}
