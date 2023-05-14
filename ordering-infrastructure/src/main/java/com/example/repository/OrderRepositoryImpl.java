package com.example.repository;

import com.example.converter.OrderConverter;
import com.example.domain.model.OrderDto;
import com.example.domain.repository.OrderRepository;
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
        if(!orderRepository.existsById(orderDto.getId())){
            throw new RuntimeException(String.format("there is no order by id : %d", orderDto.getId()));
        }
        return orderConverter.convertToOrderDto(orderRepository.save(orderConverter.convertToOrder(orderDto)));
    }
}
