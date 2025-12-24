package com.mdyasirsiddiqui.ecommerce_orderservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderItems extends BaseEntity{
    private Long productId;
    private int quantity;
    private double pricePerUnit;
    private double totalPrice;
    @ManyToOne
    @JoinColumn(name="order_id") //column in order item table which is connected to primary key of order table
    private Order order;
}
