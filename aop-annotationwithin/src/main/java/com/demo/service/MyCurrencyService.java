package com.demo.service;

import com.demo.annotation.Secured;
import com.demo.ds.CurrencyType;
import org.springframework.stereotype.Component;

@Component
@Secured
public class MyCurrencyService {
    public void changeCurrency(){

    }
    public void changeCurrency(int currency,double rate){}

    public void CurrencyLongName(CurrencyType currencyType){}

    public String CurrencyCountryName(CurrencyType currencyType){
        if(currencyType.equals(currencyType.US)) {
            return "US";
        }
            throw  new IllegalArgumentException("Error!");

    }
}
