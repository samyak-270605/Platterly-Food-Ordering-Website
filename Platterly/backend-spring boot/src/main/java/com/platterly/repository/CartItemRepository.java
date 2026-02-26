package com.platterly.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platterly.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
