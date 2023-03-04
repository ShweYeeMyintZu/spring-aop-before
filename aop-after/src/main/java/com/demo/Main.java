package com.demo;

import com.demo.aspect.AlterCurrencyServiceAspect;
import com.demo.service.AlterCurrencyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        AlterCurrencyService alterCurrencyService=context.getBean(AlterCurrencyService.class);
        alterCurrencyService.changeCurrencyService(100,2.3);
    }
}
