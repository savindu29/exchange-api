package com.exchange.exchangeapi.service;

import com.exchange.exchangeapi.dto.request.RequestProductDto;
import com.exchange.exchangeapi.dto.response.CommonResponseDto;

public interface ProductService  {
    public CommonResponseDto createProduct(RequestProductDto dto );
}
