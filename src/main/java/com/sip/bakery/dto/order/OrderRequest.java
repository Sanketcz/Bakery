package com.sip.bakery.dto.order;

import java.time.LocalDateTime;
import java.util.List;

import com.sip.bakery.dto.orderItem.OrderItemRequest;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    @NotNull
    private String customerName;

    @Pattern(
        regexp = "^[0-9]{10}$",
        message = "Phone number must contain exactly 10 digits"
    )
    private String customerPhone;

    private LocalDateTime deliveryDate;

    @NotEmpty
    @Valid
    private List<OrderItemRequest> items;
}
