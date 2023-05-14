package com.example.converter;

import com.example.domain.model.OrderDto;
import com.example.response.OrderResponseDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface ControllerOrderConverter {
     OrderResponseDto ConvertToOrderResponseDto(OrderDto updateOrder);
}
