package domain.service;

import domain.model.OrderDto;

public interface OrderService {
    Long addOrder(OrderDto orderDto);
}
