package com.example.controller;


import com.example.response.OrderResponseDto;
import com.example.domain.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.request.OrderRequestDto;

@AllArgsConstructor
@RestController
@RequestMapping("order")
public class OrderController {
    private final OrderService orderService;
    @PostMapping("/add")
    public OrderResponseDto addOrder(OrderRequestDto orderRequestDto) {
        return new OrderResponseDto(orderService.addOrder(orderRequestDto.getOrderDto()));
    }
}
