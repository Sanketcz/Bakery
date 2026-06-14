package com.sip.bakery.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "Name should be provided for product")
    @Column(nullable = false)
    private String name;

    @NotNull(message = "price should be provided")
    @Column(nullable = false)
    @Min(value = 0, message = "Price should not be less tan 0")
    private BigDecimal price;

    private String description;
    
    private boolean active;

    @NotNull(message = "Stock quantity is required")
    @Min(value = 0, message = "Stock can not be less than zero")
    @Column(name = "stock_quantity",nullable = false)
    private Integer stockQuantity;
}
