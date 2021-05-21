package com.ecoffee.ecoffee_service.services.notificationService.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mongodb.morphia.annotations.Id;

import java.util.UUID;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class PushNotification {
    @Builder.Default
    private String id = UUID.randomUUID().toString();

    @Builder.Default
    private String title = "No title";

    @Builder.Default
    private String content = "<Empty content>";
}
