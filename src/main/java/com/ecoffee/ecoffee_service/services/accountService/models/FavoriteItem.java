package com.ecoffee.ecoffee_service.services.accountService.models;

import com.ecoffee.ecoffee_service.services.discoveryService.models.ItemId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class FavoriteItem {
    private ItemId itemId;

    @Builder.Default
    private Date createdAt = new Date();
}
