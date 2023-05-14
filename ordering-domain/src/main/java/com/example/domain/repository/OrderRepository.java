package com.example.domain.repository;

import com.example.domain.model.OrderDto;

import java.util.List;

public interface OrderRepository {
    void save(OrderDto orderDto);
    OrderDto update(OrderDto orderDto);
    void deleteOrder(Long orderId);

    OrderDto getOrderById(Long orderId);

    List<OrderDto> getAllOrders();
}
