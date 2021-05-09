package com.ecoffee.ecoffee_service.services.orderService.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A CheckoutItem represents a single item that customer wants to checkout.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CheckoutItem {
    private String itemId;
    private int quantity;
}
