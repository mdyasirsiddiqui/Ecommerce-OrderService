package com.mdyasirsiddiqui.ecommerce_orderservice.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class OrderItemsRequestDTO {
    private Long productId;
    private int quantity;
}
