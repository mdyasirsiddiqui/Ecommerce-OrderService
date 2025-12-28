package com.mdyasirsiddiqui.ecommerce_orderservice.service;

import com.mdyasirsiddiqui.ecommerce_orderservice.dto.CreateOrderResponseDTO;
import com.mdyasirsiddiqui.ecommerce_orderservice.dto.OrderRequestDTO;

public interface IOrderService {
    CreateOrderResponseDTO createOrder(OrderRequestDTO dto);
}
