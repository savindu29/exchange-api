package com.exchange.exchangeapi.util;

import com.exchange.exchangeapi.dto.request.RequestProductDto;

import java.util.Arrays;
import java.util.Random;

public class ProductIdGenerator {
    private static final String nums = "0123456789";
    private static final String  letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String generateProductId(RequestProductDto dto,int size){

        Random r = new Random();
        StringBuilder str = new StringBuilder();
        str.append(dto.getDisplayName().substring(0,3).toUpperCase()) ;
        for (int i = 0; i < size; i++) {
            str.append(letters.charAt(r.nextInt(26)));
        }
        for (int i = 0; i < size/2; i++) {
            str.append(nums.charAt(r.nextInt(10)));
        }
        return str.toString();



    }




}
