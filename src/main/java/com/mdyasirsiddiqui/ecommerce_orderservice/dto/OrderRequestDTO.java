package com.mdyasirsiddiqui.ecommerce_orderservice.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor@NoArgsConstructor@Getter@Setter@Builder@ToString
public class OrderRequestDTO {
    private Long userId;
    private List<OrderItemsRequestDTO> items;
}
