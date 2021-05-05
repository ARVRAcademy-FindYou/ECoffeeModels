package com.ecoffee.ecoffee_service.services.accountService.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    private String username = "Anonymous User";

    @Builder.Default
    @Embedded
    private List<FavoriteItem> favoriteItems = new ArrayList<>();

    @Builder.Default
    private Date createdAt = new Date();
}
