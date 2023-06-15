package com.exchange.exchangeapi.dto.request;

import com.exchange.exchangeapi.entity.LovedProperty;
import com.exchange.exchangeapi.entity.Orders;
import com.exchange.exchangeapi.entity.ProductImages;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data

@AllArgsConstructor
@NoArgsConstructor

public class RequestProductDto {
    private String displayName;
    private String description;
    private double unitPrice;
    private int qty;
    private double sellingPrice;


}
