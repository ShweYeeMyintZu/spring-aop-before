package com.demo;

import com.demo.service.CurrencyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        CurrencyService currencyService=context.getBean(CurrencyService.class);
        currencyService.changeCurrency(500,1.3);
    }
}
