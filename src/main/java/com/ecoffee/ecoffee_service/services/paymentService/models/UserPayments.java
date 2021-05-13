package com.ecoffee.ecoffee_service.services.paymentService.models;

import com.ecoffee.ecoffee_service.services.accountService.models.FavoriteItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity("Payment")
public class UserPayments {
    @Id
    private String id;

    @Builder.Default
    private String sqCustomerId = "";

    @Builder.Default
    @Embedded
    private List<PaymentCard> paymentCards = new ArrayList<>();
}
