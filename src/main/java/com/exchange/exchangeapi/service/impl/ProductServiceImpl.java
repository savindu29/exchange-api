package com.exchange.exchangeapi.service.impl;

import com.exchange.exchangeapi.dto.request.RequestProductDto;
import com.exchange.exchangeapi.dto.response.CommonResponseDto;
import com.exchange.exchangeapi.repo.ProductRepo;
import com.exchange.exchangeapi.service.ProductService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductServiceImpl  implements ProductService {
    private final ProductRepo productRepo;
    @Autowired
    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public CommonResponseDto createProduct(RequestProductDto dto) {
        //productRepo.save();
        return null;
    }
}
