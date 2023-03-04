package com.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class AlterCurrencyServiceAspect {
    @After("this(com.demo.service.AlterCurrencyService)")
    public void afterCurrencyService(JoinPoint joinPoint){
        System.out.println(String.format("%s is invoked after with : %s"
                ,joinPoint.getSignature().getName()
                , Arrays.toString(joinPoint.getArgs()))
        );
    }
}
