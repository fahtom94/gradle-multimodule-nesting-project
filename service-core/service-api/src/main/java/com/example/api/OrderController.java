package com.example.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.CreateOrderService;
import com.example.dto.CreateOrderDto;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final CreateOrderService createOrderService;

    @PostMapping("/create")
    public ResponseEntity<Integer> createOrder(@RequestBody CreateOrderDto dto) {
        return ResponseEntity.ok(createOrderService.createOrder(dto));
    }
}
