package com.platterly.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platterly.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
