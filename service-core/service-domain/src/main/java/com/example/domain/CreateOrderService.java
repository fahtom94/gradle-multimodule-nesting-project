package com.example.domain;

import org.springframework.stereotype.Service;

import com.example.dto.CreateOrderDto;

@Service
public class CreateOrderService {

    public int createOrder(CreateOrderDto createOrderDto) {
        return createOrderDto.getOrderId();
    }
}
