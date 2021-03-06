package com.ecoffee.ecoffee_service.services.accountService.models;

import com.ecoffee.ecoffee_service.services.orderService.models.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity("Account")
public class Account {
    @Id
    private String id;

    @Builder.Default
    private String sqCustomerId = "";

    @Builder.Default
    private String username = "User";

    @Builder.Default
    @Embedded
    private List<FavoriteItem> favoriteItems = new ArrayList<>();

    @Builder.Default
    private Map<String, List<String>> orders = new HashMap<>();

    @Builder.Default
    private List<String> topics = new ArrayList<>();

    @Builder.Default
    private String notificationToken = null;

    @Builder.Default
    private List<String> recurringNotificationIds = new ArrayList<>();

    @Builder.Default
    private Date createdAt = new Date();

    @Builder.Default
    @Embedded
    private List<OrderItem> cart = new ArrayList<>();
}
