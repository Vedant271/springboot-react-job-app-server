package com.javaproject.app.springboot_react_job_app_server.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceMonitorAspect {
    public static final Logger LOGGER = LoggerFactory.getLogger(PerformanceMonitorAspect.class);

    @Around("execution(* com.javaproject.app.springboot_react_job_app_server.service.JobService.*(..))")
    public Object monitorTime(ProceedingJoinPoint jp) throws Throwable {
        Long start = System.currentTimeMillis();
        Object obj = jp.proceed();
        Long end = System.currentTimeMillis();
        LOGGER.info("time Taken by "+jp.getSignature().getName()+" is "+(end-start));
        return obj;
    }
}
