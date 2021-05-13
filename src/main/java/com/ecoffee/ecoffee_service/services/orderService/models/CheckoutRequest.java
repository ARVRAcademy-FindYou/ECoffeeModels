package com.ecoffee.ecoffee_service.services.orderService.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CheckoutRequest {
    @NonNull
    private String uid;

    @NonNull
    private String storeId;

    @NonNull
    private List<CheckoutItem> items;

    @Builder.Default
    private String note = "";

    @Builder.Default
    private PaymentMethod paymentMethod = PaymentMethod.CARD_ON_FILE;

    private String paymentId = "";
}
