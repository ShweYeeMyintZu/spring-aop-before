package com.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class CurrencyServiceAspect {
   // @Before("this(com.demo.service.CurrencyService)")
    //...For JDK proxy, use this for interface
    @Before("target(com.demo.service.CurrencyServiceImpl)")
    //..For JDK proxy, use target for implementation class

   public void changeCurrency(JoinPoint joinPoint){
       System.out.println(String.format("%s is invoked before with :: %s",
               joinPoint.getSignature().getName(),
               Arrays.toString(joinPoint.getArgs())));
   }

}
