package com.sip.bakery.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sip.bakery.entities.Order;
import com.sip.bakery.repositories.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public Order createOrder(Order order) {

        if (order.getStatus() == null || order.getStatus().isBlank()) {
            order.setStatus("CONFIRMED");
        }

        return orderRepository.save(order);
    }

    public Order updateOrder(Long id, Order order) {

        Order existingOrder = orderRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Order not found with id = " + id));

        existingOrder.setCustomerName(order.getCustomerName());
        existingOrder.setCustomerPhone(order.getCustomerPhone());
        existingOrder.setDeliveryDate(order.getDeliveryDate());
        existingOrder.setStatus(order.getStatus());
        existingOrder.setTotalPrice(order.getTotalPrice());

        return orderRepository.save(existingOrder);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {

        return orderRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Order not found with id = " + id));
    }

    public void deleteOrder(Long id) {

        Order order = orderRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Order not found with id = " + id));

        orderRepository.delete(order);
    }
}