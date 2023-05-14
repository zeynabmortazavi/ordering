package com.example.converter;

import com.example.domain.model.OrderDto;
import com.example.entity.Order;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface OrderConverter {
     Order convertToOrder(OrderDto orderDto);
     OrderDto convertToOrderDto(Order order) ;
}
