package com.mdyasirsiddiqui.ecommerce_orderservice.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class OrderItemsDTO {
    private Long productId;
    private Long quantity;
}
