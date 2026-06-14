package com.sip.bakery.dto.product;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    @NotNull(message = "Product name is required")
    private String name;

    @NotNull(message = "Price is required")
    private BigDecimal price;

    private String description;

    private boolean active;

    @NotNull(message = "Stock quantity is required")
    private Integer stockQuantity;
}
