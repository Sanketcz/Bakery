package com.sip.bakery.entities;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "order")
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "order_number", nullable = false)
    private String orderNumber;

    @Column(name = "customer_name", nullable = false)
    private String customerName;

    @Column(name = "customer_phone", nullable = false)
    @Min(value = 10, message = "Phone number should contain 10 digits")
    private BigInteger customerPhone;

    @Column(name = "order_date", nullable = false)
    private LocalDateTime orderDate;

    @jakarta.persistence.PrePersist
    public void PrePersist(){
        this.orderDate = LocalDateTime.now();
    }

    @Column(name = "deliveryDate")
    private LocalDateTime deliveryDate;

    private String status;

    @Column(name = "total_price", nullable = false)
    private BigDecimal totalPrice;

}
