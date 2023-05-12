import converter.OrderConverter;
import domain.model.OrderDto;
import domain.repository.OrderRepository;
import lombok.AllArgsConstructor;
import repository.JpaOrderRepository;

@AllArgsConstructor
public class OrderRepositoryImpl implements OrderRepository {

    private final JpaOrderRepository orderRepository;
    private final OrderConverter orderConverter;
    @Override
    public void save(OrderDto orderDto) {
        orderRepository.save(orderConverter.convertToOrder(orderDto));
    }
}
