package com.mdyasirsiddiqui.ecommerce_orderservice.clients;

import com.mdyasirsiddiqui.ecommerce_orderservice.dto.ProductDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Component
public class ProductServiceClient {
    private  final RestTemplateBuilder restTemplateBuilder;

    public ProductServiceClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    public ProductDTO getProductById(Long productId)
    {
        RestTemplate restTemplate= restTemplateBuilder.build();
        String url="http//localhost:8080/api/products"+productId;
        ResponseEntity<ProductDTO> response=restTemplate.getForEntity(url, ProductDTO.class);
        return response.getBody();
    }
}

