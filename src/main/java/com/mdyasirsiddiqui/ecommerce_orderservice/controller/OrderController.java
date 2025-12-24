package com.mdyasirsiddiqui.ecommerce_orderservice.controller;

import com.mdyasirsiddiqui.ecommerce_orderservice.dto.CreateOrderResponseDTO;
import com.mdyasirsiddiqui.ecommerce_orderservice.dto.OrderRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/order")
public class OrderController {
    @PostMapping
    public ResponseEntity<CreateOrderResponseDTO> addOrder(OrderRequestDTO dto)
    {

    }
}
