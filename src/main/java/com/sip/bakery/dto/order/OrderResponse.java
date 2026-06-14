package com.sip.bakery.dto.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.sip.bakery.dto.orderItem.OrderItemResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderResponse {
    private Long id;

    private String orderNumber;

    private String customerName;

    private String customerPhone;

    private LocalDateTime orderDate;

    private LocalDateTime deliveryDate;

    private String status;

    private BigDecimal totalPrice;

    private List<OrderItemResponse> items;
}
