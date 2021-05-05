package com.ecoffee.ecoffee_service.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Coordinates {
    private Double longitude;
    private Double latitude;
}
