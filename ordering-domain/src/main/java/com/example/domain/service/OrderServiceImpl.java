package com.example.domain.service;

import com.example.domain.model.OrderDto;
import com.example.domain.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    @Override
    public Long addOrder(OrderDto orderDto) {
        orderRepository.save(orderDto);
        return orderDto.getId();
    }
}