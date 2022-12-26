package io.vaibhav.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoogerAspect {


    @Around("@annotation(io.vaibhav.spring.aop.aop.annotations.CustomLogger)")
    public Object logger(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Starting of the function ");

        try{
            return proceedingJoinPoint.proceed();
        }finally {
            System.out.println("End of the function ");
        }


    }

}
