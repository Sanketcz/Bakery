package com.sip.bakery.dto.orderItem;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class OrderItemRequest {
    @NotNull
    private Long productId;

    @Min(1)
    private Integer quantity;
}
