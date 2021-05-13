package com.ecoffee.ecoffee_service.services.paymentService.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class OrderTax {
    @Builder.Default
    private String name = "Unknown";

    @Builder.Default
    private long total = 0L;
}
