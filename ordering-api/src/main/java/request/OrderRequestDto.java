package request;

import domain.model.OrderDto;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class OrderRequestDto {
    @NotNull
    private OrderDto orderDto;
}
