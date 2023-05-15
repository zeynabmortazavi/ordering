package com.example.domain.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import java.util.stream.Stream;

@Component
@Aspect
@Slf4j
public class OrderLoggingAspect {
    @Pointcut("@annotation(com.example.domain.aspect.LogOrderService)")
    public void logMethodExecution() {}

    @Around("logMethodExecution()")
    public Object logMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String methodName = proceedingJoinPoint.getSignature().getName();
        Object[] args = proceedingJoinPoint.getArgs();

        Stream.of(args).forEach(arg -> log.info("Method " + methodName + " called with arguments: " + arg));

        Object result = proceedingJoinPoint.proceed();

        log.info("Method " + methodName + " returned with value: " + result);

        return result;
    }
}
