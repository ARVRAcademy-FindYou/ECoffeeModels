package com.ecoffee.ecoffee_service.services.notificationService.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mongodb.morphia.annotations.Id;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class PushNotification {
    @Id
    private String id;

    private String title;
    private String content;
}
