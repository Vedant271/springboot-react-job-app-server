package com.javaproject.app.springboot_react_job_app_server.aop;

import lombok.extern.java.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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
}
