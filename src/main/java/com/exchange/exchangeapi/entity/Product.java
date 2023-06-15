package com.exchange.exchangeapi.entity;

import com.exchange.exchangeapi.entity.share.FileResource;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name = "product_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    /*propertyId, display_name, description, unit_price, qty, images, selling_price*/
    @Id
    @Column(name = "property_id")
    private String propertyId;

    @Column(name = "display_name")
    private String displayName;

    private String description;

    @Column(name = "unit_price")
    private double unitPrice;

    private int qty;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<ProductImages> images;

    @Column(name = "selling_price")
    private double sellingPrice;

    @OneToMany(mappedBy = "productPropertyId", cascade = CascadeType.ALL)
    private List<Orders> ordersList;

    @OneToMany(mappedBy ="productPropertyId" )
    private List<LovedProperty> lovedProperties;
}
