package com.ecoffee.ecoffee_service.services.orderService.models;

import com.ecoffee.ecoffee_service.services.paymentService.models.OrderTax;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CalculateOrderResponse {
    private OrderTax salesTax;
    private long total;
}
