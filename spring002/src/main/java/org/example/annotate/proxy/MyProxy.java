package org.example.annotate.proxy;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.example.annotate.servies.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyProxy {
    private static final Logger logger = LoggerFactory.getLogger(MyProxy.class);

    @Before("execution(* org.example.annotate.servies.UserService.*(..))")
    public void logger() throws Exception {
        System.out.println("这是一个前置通知");
    }
    @AfterReturning("execution(* org.example.annotate.servies.UserService.*(..))")
    public void logg() throws Exception {
        System.out.println("这是一个后置通知");
    }
}
