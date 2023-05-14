package com.example.controller;


import com.example.converter.ControllerOrderConverter;
import com.example.response.OrderResponseDto;
import com.example.domain.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.request.OrderRequestDto;

@AllArgsConstructor
@RestController
@RequestMapping("order")
public class OrderController {
    private final OrderService orderService;
    private final ControllerOrderConverter controllerOrderConverter;
    @PostMapping("/add")
    public OrderResponseDto addOrder(@RequestBody OrderRequestDto orderRequestDto) {
        return new OrderResponseDto(orderService.addOrder(orderRequestDto.getOrderDto()));
    }

    @PutMapping("/update")
    public OrderResponseDto updateOrder(@RequestBody OrderRequestDto orderRequestDto) {
        return controllerOrderConverter.ConvertToOrderResponseDto(orderService.updateOrder(orderRequestDto.getOrderDto()));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteOrder(@PathVariable("id") Long orderId){
        orderService.deleteOrder(orderId);
        return new ResponseEntity<>("Order successfully deleted!", HttpStatus.OK);
    }

    @GetMapping("{id}")
    public OrderResponseDto getOrderById(@PathVariable("id") Long orderId){
        return controllerOrderConverter.ConvertToOrderResponseDto(orderService.getOrderById(orderId));
    }

}
