package com.mdyasirsiddiqui.ecommerce_orderservice.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
@ToString
public class ProductDTO {
    private Long id;
    private String title;
    private Double price;
    private String description;
    private Long categoryId;
    private String image;
}
