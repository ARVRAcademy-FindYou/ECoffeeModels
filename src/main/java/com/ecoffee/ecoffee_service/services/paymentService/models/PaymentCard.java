package com.ecoffee.ecoffee_service.services.paymentService.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PaymentCard {

    @Id
    private String id = "";

    @Builder.Default
    private String card_brand = "";

    @Builder.Default
    private String last_4 = "";

    @Builder.Default
    private long exp_month = 0;

    @Builder.Default
    private long exp_year = 0;

}
