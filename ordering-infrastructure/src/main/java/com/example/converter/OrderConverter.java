package com.example.converter;

import com.example.domain.model.OrderDto;
import com.example.entity.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderConverter {
    public Order convertToOrder(OrderDto orderDto) {
        Order order = new Order();
        order.setId(orderDto.getId());
        order.setName(orderDto.getName());
        order.setPrice(orderDto.getPrice());
        return order;
    }
}
