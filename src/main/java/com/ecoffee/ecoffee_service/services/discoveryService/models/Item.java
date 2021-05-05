package com.ecoffee.ecoffee_service.services.discoveryService.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Item {
    @Builder.Default
    private String id = UUID.randomUUID().toString();

    @Builder.Default
    private String name = "Anonymous Item";

    @Builder.Default
    private String description = "";

    @Builder.Default
    private Long price = 0L;

    @Builder.Default
    private int numSold = 0;

    @Builder.Default
    private String category = "Not Specified";

    @Builder.Default
    private Date createdAt = new Date();
}
