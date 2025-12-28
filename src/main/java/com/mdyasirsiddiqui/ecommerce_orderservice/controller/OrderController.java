package com.mdyasirsiddiqui.ecommerce_orderservice.controller;

import com.mdyasirsiddiqui.ecommerce_orderservice.dto.CreateOrderResponseDTO;
import com.mdyasirsiddiqui.ecommerce_orderservice.dto.OrderRequestDTO;
import com.mdyasirsiddiqui.ecommerce_orderservice.mapper.OrderMapper;
import com.mdyasirsiddiqui.ecommerce_orderservice.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("api/order")
public class OrderController {
    private IOrderService orderService;
    public OrderController(IOrderService orderService)
    {
        this.orderService=orderService;
    }
    @PostMapping
    public ResponseEntity<CreateOrderResponseDTO> addOrder(@RequestBody OrderRequestDTO dto)
    {
        log.info("dto is {}", dto);
        CreateOrderResponseDTO responseDTO=orderService.createOrder(dto);
        log.info("in addOrder controller ");
        return ResponseEntity.ok(responseDTO);
        //return ResponseEntity.ok(orderService.createOrder(dto));
    }
}
