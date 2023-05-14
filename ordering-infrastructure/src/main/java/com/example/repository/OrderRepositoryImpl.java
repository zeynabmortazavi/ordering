package com.example.repository;

import com.example.converter.OrderConverter;
import com.example.domain.model.OrderDto;
import com.example.domain.repository.OrderRepository;
import com.example.entity.Order;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class OrderRepositoryImpl implements OrderRepository {

    private final JpaOrderRepository orderRepository;
    private final OrderConverter orderConverter;
    @Override
    public void save(OrderDto orderDto) {
        orderRepository.save(orderConverter.convertToOrder(orderDto));
    }

    @Override
    public OrderDto update(OrderDto orderDto) {

        Order existingOrder = orderRepository.findById(orderDto.getId()).orElseThrow(
                () -> new RuntimeException(String.format("there is no order by id : %d", orderDto.getId()))
        );

        existingOrder.setName(orderDto.getName());
        existingOrder.setPrice(orderDto.getPrice());
        return orderConverter.convertToOrderDto(orderRepository.save(existingOrder));
    }

    @Override
    public void deleteOrder(Long orderId) {
        Order existingOrder = orderRepository.findById(orderId).orElseThrow(
                () -> new RuntimeException(String.format("there is no order by id : %d", orderId))
        );
        orderRepository.deleteById(existingOrder.getId());
    }

    @Override
    public OrderDto getOrderById(Long orderId) {
        Order existingOrder = orderRepository.findById(orderId).orElseThrow(
                () -> new RuntimeException(String.format("there is no order by id : %d", orderId))
        );
        return orderConverter.convertToOrderDto(existingOrder);
    }
}
