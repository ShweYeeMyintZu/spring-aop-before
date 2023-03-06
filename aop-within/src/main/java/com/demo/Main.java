package com.demo;

import com.demo.service.MyCurrencyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        MyCurrencyService myCurrencyService=context.getBean(MyCurrencyService.class);
        myCurrencyService.changeCurrency(100,2.3);
        myCurrencyService.changeCurrency();
    }
}
