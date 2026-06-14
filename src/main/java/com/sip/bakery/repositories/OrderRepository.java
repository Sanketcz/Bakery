package com.sip.bakery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sip.bakery.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
