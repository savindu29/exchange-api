package com.exchange.exchangeapi.entity;

import com.exchange.exchangeapi.entity.share.FileResource;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProductImages {
    @Id
    @Column(name = "property_id")
    private String propertyId;
    @Embedded
    private FileResource resource;
    @ManyToOne
    private Product product;
}
