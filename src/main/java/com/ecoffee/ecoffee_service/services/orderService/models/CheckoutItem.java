package com.ecoffee.ecoffee_service.services.orderService.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * A CheckoutItem represents a single item that customer wants to checkout.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CheckoutItem {
    @NonNull
    private String itemId;
    private int quantity;
}
