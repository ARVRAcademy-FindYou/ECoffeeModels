package com.ecoffee.ecoffee_service.services.discoveryService.models;

import com.ecoffee.ecoffee_service.services.notificationService.models.PushNotification;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Indexed;
import org.mongodb.morphia.annotations.PrePersist;
import org.mongodb.morphia.utils.IndexDirection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity("Store")
public class Store {
    @Id
    private String id;

    @Builder.Default
    private String name = "Anonymous Store";

    @Builder.Default
    private String phone = "123-456-7890";

    @Builder.Default
    private String email = "me@example.com";

    @Builder.Default
    private String address = "N/A";

    @Builder.Default
    private String ownerId = "";

    @Builder.Default
    private String sqAccessToken = "";

    @Builder.Default
    private Date sqAccessTokenExpiresAt = null;

    @Builder.Default
    @Indexed(IndexDirection.GEO2D)
    private double[] loc = new double[] {0.0, 0.0};

    @Builder.Default
    @Embedded
    private Map<String, Item> items = new HashMap<>();

    @Builder.Default
    @Embedded
    private List<PushNotification> pushNotifications = new ArrayList<>();

    @Builder.Default
    private String notificationTopicId = "";

    @Builder.Default
    private Date createdAt = new Date();

    @Builder.Default
    private Date updatedAt = new Date();

    @PrePersist
    void prePersist() {
        this.updatedAt = new Date();
    }
}
