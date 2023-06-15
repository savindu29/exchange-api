package com.exchange.exchangeapi.entity;

import com.exchange.exchangeapi.entity.share.FileResource;
import com.exchange.exchangeapi.entity.share.UserNameResource;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @Column(name = "propertyId")
    private String propertyId;
    @Column(name = "contact_number")
    private String contactNumber;
    @Embedded
    private UserNameResource userName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "is_account_non_expire")
    private boolean isAccountNonExpire;
    @Column(name = "is_account_non_lock")
    private boolean isAccountNonLock;
    @Column(name = "is_credentials_non_expire")
    private boolean isCredentialsNonExpire;
    @Column(name = "is_enabled")
    private boolean isEnabled;
    @Column(name = "prefix")
    private String prefix;
    @Embedded
    private FileResource avatar;
    @OneToMany(mappedBy = "userPropertyId" ,cascade = CascadeType.ALL)
    private List<Orders> orderList;

    @OneToMany(mappedBy ="userPropertyId" )
    private List<LovedProperty> lovedProperties;
    @OneToOne
    @JoinColumn(name = "role_id", unique = true)
    private UserRole userRole;

//    avatar;


          /*  propertyId,
            contact_number,
            first_name,
            last_name,
            email,
            password,
            is_account_non_expire,
            is_account_non_lock,
            is_credentials_non_expire,
            is_enabled,
            prefix,
            avatar*/
}
