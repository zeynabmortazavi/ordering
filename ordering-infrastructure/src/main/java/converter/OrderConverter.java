package converter;

import domain.model.OrderDto;
import entity.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderConverter {
    public Order convertToOrder(OrderDto orderDto) {
        Order order = new Order();
        order.setId(orderDto.getId());
        order.setName(orderDto.getName());
        order.setPrice(orderDto.getPrice());
        return order;
    }
}
