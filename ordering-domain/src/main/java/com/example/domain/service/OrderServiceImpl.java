package com.example.domain.service;

import com.example.domain.aspect.LogOrderService;
import com.example.domain.model.OrderDto;
import com.example.domain.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    @Override
    @LogOrderService
    public Long addOrder(OrderDto orderDto) {
        orderRepository.save(orderDto);
        return orderDto.getId();
    }

    @Override
    @LogOrderService
    public OrderDto updateOrder(OrderDto orderDto) {
        return orderRepository.update(orderDto);
    }

    @Override
    @LogOrderService
    public void deleteOrder(Long orderId) {
        orderRepository.deleteOrder(orderId);
    }

    @Override
    @LogOrderService
    public OrderDto getOrderById(Long orderId) {
        return orderRepository.getOrderById(orderId);
    }

    @Override
    @LogOrderService
    public List<OrderDto> getAllOrders() {
        return orderRepository.getAllOrders();
    }
}
