package com.example.domain.service;

import com.example.domain.model.OrderDto;

import java.util.List;

public interface OrderService {
    Long addOrder(OrderDto orderDto);

    OrderDto updateOrder(OrderDto orderDto);

    void deleteOrder(Long orderId);

    OrderDto getOrderById(Long orderId);

    List<OrderDto> getAllOrders();
}
