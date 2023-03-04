package com.demo.service;

import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Component;

@Component
public class AlterCurrencyService {
    //For CGLIB Proxy, both this and target can use


    public int changeCurrencyService(int currency,double rate){
        return 0;
    }
}
