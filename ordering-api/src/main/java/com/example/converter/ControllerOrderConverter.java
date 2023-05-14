package com.example.converter;

import com.example.domain.model.OrderDto;
import com.example.response.OrderResponseDto;
import org.springframework.stereotype.Component;

@Component
public class ControllerOrderConverter {
    public OrderResponseDto ConvertToOrderResponseDto(OrderDto updateOrder) {
        OrderResponseDto orderResponseDto = new OrderResponseDto();
        orderResponseDto.setId(updateOrder.getId());
        orderResponseDto.setName(updateOrder.getName());
        orderResponseDto.setPrice(updateOrder.getPrice());
        return orderResponseDto;
    }
}
