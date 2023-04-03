package org.example.annotate.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(0)
public class MyProxy2 {

    private static final Logger logger = LoggerFactory.getLogger(MyProxy2.class);

    @Around("execution(* org.example.annotate.servies.UserService.*(..))")
    public Object logger(ProceedingJoinPoint joinPoint) throws Throwable {


        System.out.println("环绕执行 begin");
        long l = System.currentTimeMillis();
      int a= (int) joinPoint.proceed();
        long l2 = System.currentTimeMillis();
        System.out.println("myproxy2："+(l2-l));
        System.out.println("环绕执行 and");
        return a;
    }

}
