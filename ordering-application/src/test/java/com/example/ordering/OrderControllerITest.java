package com.example.ordering;

import com.example.domain.model.OrderDto;
import com.example.request.OrderRequestDto;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OrderingApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OrderControllerITest {
    private static final String ADD_ORDER_URL = "/order/add";
    private static final String UPDATE_ORDER_URL = "/order/update";
    @Autowired
    private TestRestTemplate restTemplate;

    HttpHeaders headers;
    OrderRequestDto orderRequestDto;
    @Before
    public void setUp(){
        headers = new HttpHeaders();
        orderRequestDto = new OrderRequestDto();
        OrderDto orderDto = new OrderDto();
        orderDto.setId(1L);
        orderDto.setName("shoe");
        orderDto.setPrice(BigDecimal.valueOf(20000));
        orderRequestDto.setOrderDto(orderDto);
    }
    @Test
    public void testAddOrderService() {
        HttpEntity<OrderRequestDto> request = new HttpEntity<>(orderRequestDto,headers);
        var response = this.restTemplate.postForObject(ADD_ORDER_URL, request, LinkedHashMap.class);
        System.out.println(response.get("id"));
    }
    @Test
    public void testUpdateOrderService() {
        testAddOrderService();
        Map<String, String> params = new HashMap<>();
        params.put("id", "1");

        OrderRequestDto orderRequestDto = new OrderRequestDto();
        OrderDto orderDto = new OrderDto();
        orderDto.setId(1L);
        orderDto.setName("bag");
        orderDto.setPrice(BigDecimal.valueOf(10000));
        orderRequestDto.setOrderDto(orderDto);
        restTemplate.put(UPDATE_ORDER_URL, orderRequestDto, params);
    }
}