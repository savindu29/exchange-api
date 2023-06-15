package com.exchange.exchangeapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity (name="")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRole {
    @Id
    @Column (name = "property_id")
    private String propertyId;
    @Column (name = "role_name")
    private String roleName;
    @Column (name = "role_description")
    private String roleDescription;

    @OneToOne(mappedBy = "userRole")
    private User user;

}
