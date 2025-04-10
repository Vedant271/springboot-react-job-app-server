package com.javaproject.app.springboot_react_job_app_server.service;

import com.javaproject.app.springboot_react_job_app_server.model.JobPost;
import com.javaproject.app.springboot_react_job_app_server.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public void addJob(JobPost jobPost){
        jobRepository.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return jobRepository.getAllJobs();
    }
}
