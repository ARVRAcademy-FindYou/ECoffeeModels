package com.ecoffee.ecoffee_service.services.accountService.models;

import lombok.*;

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
