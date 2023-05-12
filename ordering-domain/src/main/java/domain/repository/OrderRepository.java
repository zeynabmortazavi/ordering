package domain.repository;

import domain.model.OrderDto;

public interface OrderRepository {
    void save(OrderDto orderDto);
}
