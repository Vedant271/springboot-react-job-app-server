package com.javaproject.app.springboot_react_job_app_server.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {
    public static final Logger LOGGER = LoggerFactory.getLogger(PerformanceMonitorAspect.class);

    @Around("execution(* com.javaproject.app.springboot_react_job_app_server.service.JobService.*(..)) && args(postId)")
    public Object validateAndUpdate(ProceedingJoinPoint jp, int postId) throws Throwable {
        if(postId<0){
            LOGGER.info("Input is Negative");
            postId=-postId;
            LOGGER.info("New Value is "+postId);
        }
        Object obj = jp.proceed(new Object[]{postId});
        return obj;
    }
}
