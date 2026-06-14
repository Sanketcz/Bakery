package com.sip.bakery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sip.bakery.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    
}
