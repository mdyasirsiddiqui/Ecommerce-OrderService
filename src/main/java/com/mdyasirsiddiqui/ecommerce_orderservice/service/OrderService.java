package com.mdyasirsiddiqui.ecommerce_orderservice.service;

import com.mdyasirsiddiqui.ecommerce_orderservice.clients.ProductServiceClient;
import com.mdyasirsiddiqui.ecommerce_orderservice.dto.CreateOrderResponseDTO;
import com.mdyasirsiddiqui.ecommerce_orderservice.dto.OrderItemsRequestDTO;
import com.mdyasirsiddiqui.ecommerce_orderservice.dto.OrderRequestDTO;
import com.mdyasirsiddiqui.ecommerce_orderservice.dto.ProductDTO;
import com.mdyasirsiddiqui.ecommerce_orderservice.entity.Order;
import com.mdyasirsiddiqui.ecommerce_orderservice.entity.OrderItems;
import com.mdyasirsiddiqui.ecommerce_orderservice.mapper.OrderItemMapper;
import com.mdyasirsiddiqui.ecommerce_orderservice.mapper.OrderMapper;
import com.mdyasirsiddiqui.ecommerce_orderservice.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Slf4j
@Service
public class OrderService implements IOrderService{
    private OrderRepository repo;
    private ProductServiceClient client;

    public OrderService(OrderRepository repo,ProductServiceClient client)
    {
        this.repo=repo;
        this.client=client;
    }
    @Override
    public CreateOrderResponseDTO createOrder(OrderRequestDTO request) {
        log.info("request is {}", request);
    Order order=OrderMapper.toEntity(request);
    log.info(" In order service - order is recived {}", order);
//    Order saved=repo.save(order);
//    return OrderMapper.toDto(saved);
        List<OrderItems> itemsList=new ArrayList<>();
        log.info(" item list is created");
        for(OrderItemsRequestDTO itemsRequestDTO : request.getItems())
        {
            ProductDTO product=client.getProductById(itemsRequestDTO.getProductId());
            log.info("product details {}", product);
            double pricePerUnit=product.getPrice();
            double totalPrice=pricePerUnit*itemsRequestDTO.getQuantity();

            OrderItems item= OrderItemMapper.OrderItemRequestDTOtoOrderItemEntity(itemsRequestDTO,order,pricePerUnit,totalPrice);
            itemsList.add(item);
        }
        order.setItemList(itemsList);
        Order createdOrder = repo.save(order);


        return OrderMapper.toCreateOrderResponseDTO(createdOrder);
    }
}
