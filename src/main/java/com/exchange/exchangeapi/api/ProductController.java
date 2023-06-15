package com.exchange.exchangeapi.api;

import com.exchange.exchangeapi.dto.request.RequestProductDto;
import com.exchange.exchangeapi.util.StandardResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {
    @PostMapping("/member/create")
    public ResponseEntity<StandardResponse> createProduct(
        @RequestBody RequestProductDto dto ){
        return null;
    }
}
