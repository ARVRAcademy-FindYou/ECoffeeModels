package com.ecoffee.ecoffee_service.domain.oAuth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.Date;

/**
 * An OAuth key is a key that allows eCoffee to access external services on behalf of its retailers/customers.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity("OAuth")
public class APIKey {
    @Id
    private String ownerId;
    private String accessToken;
    private Date expirationDate;
}
