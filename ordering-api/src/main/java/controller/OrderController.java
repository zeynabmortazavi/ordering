package controller;


import api.OrderFacade;
import domain.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import request.OrderRequestDto;
import response.OrderResponseDto;

@AllArgsConstructor
@RestController
public class OrderController implements OrderFacade {
    private final OrderService orderService;
    @Override
    public OrderResponseDto addOrder(OrderRequestDto orderRequestDto) {
        return new OrderResponseDto(orderService.addOrder(orderRequestDto.getOrderDto()));
    }
}
