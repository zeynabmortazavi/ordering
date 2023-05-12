package api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import request.OrderRequestDto;
import response.OrderResponseDto;

@RequestMapping("/order")
public interface OrderFacade {
    @PostMapping("/add")
    OrderResponseDto addOrder(@RequestBody OrderRequestDto orderRequestDto);
}
