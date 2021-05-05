package com.ecoffee.ecoffee_service.services.discoveryService.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * An ItemId is a String with the format: <StoreId>.<entityId>.
 * Example: DoteCafe1.XYZ3Mocha
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ItemId {
    private String storeId;
    private String entityId;

    public static ItemId of(String itemId) {
        String[] parts = itemId.split("\\.");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Invalid item id " + itemId);
        }
        return ItemId.builder().storeId(parts[0]).entityId(parts[1]).build();
    }

    @Override
    public String toString() {
        return String.format("%s.%s", storeId, entityId);
    }
}
