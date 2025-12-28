package com.mdyasirsiddiqui.ecommerce_orderservice.mapper;

import com.mdyasirsiddiqui.ecommerce_orderservice.dto.CreateOrderResponseDTO;
import com.mdyasirsiddiqui.ecommerce_orderservice.dto.OrderItemsRequestDTO;
import com.mdyasirsiddiqui.ecommerce_orderservice.entity.Order;
import com.mdyasirsiddiqui.ecommerce_orderservice.entity.OrderItems;

public class OrderItemMapper {
    public  static OrderItems OrderItemRequestDTOtoOrderItemEntity(OrderItemsRequestDTO dto, Order order,double pricePerUnit, double totalPrice)
    {
        return OrderItems.builder()
                .productId(dto.getProductId())
                .quantity(dto.getQuantity())
                .pricePerUnit(pricePerUnit)
                .totalPrice(totalPrice)
                .order(order)
                .build();
    }

}
