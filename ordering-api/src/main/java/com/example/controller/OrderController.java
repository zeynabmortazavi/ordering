package com.example.controller;


import com.example.api.OrderFacade;
import com.example.response.OrderResponseDto;
import com.example.domain.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import com.example.request.OrderRequestDto;

@AllArgsConstructor
@RestController
public class OrderController implements OrderFacade {
    private final OrderService orderService;
    @Override
    public OrderResponseDto addOrder(OrderRequestDto orderRequestDto) {
        return new OrderResponseDto(orderService.addOrder(orderRequestDto.getOrderDto()));
    }
}
