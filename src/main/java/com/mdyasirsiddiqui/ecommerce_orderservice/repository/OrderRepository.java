package com.mdyasirsiddiqui.ecommerce_orderservice.repository;

import com.mdyasirsiddiqui.ecommerce_orderservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
