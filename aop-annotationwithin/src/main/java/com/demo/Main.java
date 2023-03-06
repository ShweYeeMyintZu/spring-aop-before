package com.demo;

import com.demo.ds.CurrencyType;
import com.demo.service.MyCurrencyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        MyCurrencyService myCurrencyService=context.getBean(MyCurrencyService.class);
        myCurrencyService.changeCurrency();
        myCurrencyService.changeCurrency(100,2.3);
        myCurrencyService.CurrencyLongName(CurrencyType.US);
        myCurrencyService.CurrencyLongName(CurrencyType.EURO);
        myCurrencyService.CurrencyCountryName(CurrencyType.US);
        try {
            myCurrencyService.CurrencyCountryName(CurrencyType.EURO);
        }catch (IllegalArgumentException e){
            System.out.println("Exception caught");
        }
    }
}
