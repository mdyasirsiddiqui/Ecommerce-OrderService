package com.mdyasirsiddiqui.ecommerce_orderservice.mapper;

import com.mdyasirsiddiqui.ecommerce_orderservice.dto.CreateOrderResponseDTO;
import com.mdyasirsiddiqui.ecommerce_orderservice.dto.OrderRequestDTO;
import com.mdyasirsiddiqui.ecommerce_orderservice.entity.Order;
import com.mdyasirsiddiqui.ecommerce_orderservice.enums.OrderStatus;

public class OrderMapper {
    public static  Order toEntity(OrderRequestDTO dto)
    {
        return Order.builder()
                .userId(dto.getUserId())
                .status(OrderStatus.PENDING)
                .build();

    }
    public static CreateOrderResponseDTO toCreateOrderResponseDTO(Order order)
    {
        return CreateOrderResponseDTO.builder()
                .orderId(order.getUserId())
                .status(order.getStatus())
                .build();
    }
}
