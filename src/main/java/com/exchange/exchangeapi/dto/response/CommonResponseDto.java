package com.exchange.exchangeapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommonResponseDto {
    private int code;
    private String message;
    private Object data;
}
