package com.example.api;

import com.example.response.OrderResponseDto;
import org.springframework.web.bind.annotation.*;
import com.example.request.OrderRequestDto;

@RestController
@RequestMapping("order")
public interface OrderFacade {
    @PostMapping("/add")
    OrderResponseDto addOrder(@RequestBody OrderRequestDto orderRequestDto);
}
