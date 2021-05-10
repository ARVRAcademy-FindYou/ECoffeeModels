package com.ecoffee.ecoffee_service.services.orderService.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CheckoutRequest {
    private String uid;
    private String storeId;
    private List<CheckoutItem> items;

    @Builder.Default
    private String note = "";
}
