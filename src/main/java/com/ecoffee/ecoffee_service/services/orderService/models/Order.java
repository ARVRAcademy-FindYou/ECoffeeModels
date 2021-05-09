package com.ecoffee.ecoffee_service.services.orderService.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.PrePersist;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * An order represents a customer order.
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Order {
    @Id
    private String id;

    @Builder.Default
    private String storeId = "";

    @Builder.Default
    private String userId = "";

    @Builder.Default
    private Long total = 0L;

    @Builder.Default
    private OrderStatus status = OrderStatus.ACTIVE;

    @Builder.Default
    private List<OrderItem> orderItem = new ArrayList<>();

    @Builder.Default
    private String note = "N/A";

    @Builder.Default
    private String paymentId = "";

    private String paymentStatus = "PENDING";

    @Builder.Default
    private Date createdAt = new Date();

    @Builder.Default
    private Date updatedAt = new Date();

    @PrePersist
    void prePersist() {
        this.updatedAt = new Date();
    }
}
