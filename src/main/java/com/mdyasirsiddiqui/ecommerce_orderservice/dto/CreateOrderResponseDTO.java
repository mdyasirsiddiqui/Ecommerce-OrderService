package com.mdyasirsiddiqui.ecommerce_orderservice.dto;

import com.mdyasirsiddiqui.ecommerce_orderservice.enums.OrderStatus;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class CreateOrderResponseDTO {
    private Long orderId;
    private OrderStatus status;
}
