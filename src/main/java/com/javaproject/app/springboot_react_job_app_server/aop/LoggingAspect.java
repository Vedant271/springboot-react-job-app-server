package com.javaproject.app.springboot_react_job_app_server.aop;

import lombok.extern.java.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    public static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    // return type class-name.method-name(args)
    @Before("execution(* com.javaproject.app.springboot_react_job_app_server.service.JobService.getAllJobPosts(..)) || execution(* com.javaproject.app.springboot_react_job_app_server.service.JobService.getJobPost(..))")
    public void logMethodCall(JoinPoint jp){
        LOGGER.info("Method Called "+jp.getSignature().getName());
    }

    @AfterThrowing("execution(* com.javaproject.app.springboot_react_job_app_server.service.JobService.getAllJobPosts(..)) || execution(* com.javaproject.app.springboot_react_job_app_server.service.JobService.getJobPost(..))")
    public void logMethodCrash(JoinPoint jp){
        LOGGER.info("Method Has Some Issues "+jp.getSignature().getName());
    }

    @AfterReturning("execution(* com.javaproject.app.springboot_react_job_app_server.service.JobService.getAllJobPosts(..)) || execution(* com.javaproject.app.springboot_react_job_app_server.service.JobService.getJobPost(..))")
    public void logMethodExecutedSuccess(JoinPoint jp){
        LOGGER.info("Method Executed Successfully "+jp.getSignature().getName());
    }

    @After("execution(* com.javaproject.app.springboot_react_job_app_server.service.JobService.getAllJobPosts(..)) || execution(* com.javaproject.app.springboot_react_job_app_server.service.JobService.getJobPost(..))")
    public void logMethodExecuted(JoinPoint jp){
        LOGGER.info("Method Executed "+jp.getSignature().getName());
    }
}
