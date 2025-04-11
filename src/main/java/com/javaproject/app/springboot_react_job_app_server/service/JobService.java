package com.javaproject.app.springboot_react_job_app_server.service;

import com.javaproject.app.springboot_react_job_app_server.model.JobPost;
import com.javaproject.app.springboot_react_job_app_server.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {


    @Autowired
    private JobRepository jobRepository;

    public List<JobPost> getAllJobPosts(){
        return jobRepository.findAll();
    }

    public JobPost getJobPost(int postId){
        return jobRepository.findById(postId).orElse(new JobPost());
    }

    public void addJobPost(JobPost jobPost){
        jobRepository.save(jobPost);
    }

    public void updateJobPost(JobPost jobPost){
        jobRepository.save(jobPost);
    }

    public void deleteJobPost(int postId){
        jobRepository.deleteById(postId);
    }

    public void load(){
        List<JobPost> jobPosts = new ArrayList<>(List.of(
                new JobPost(101, "Java Developer", "Should know about Java", 1, List.of("Java", "Spring Boot")),
                new JobPost(102, "React Developer", "Should know about JavaScript", 1, List.of("JavaScript", "React.js")),
                new JobPost(103, "Angular Developer", "Should know about TypeScript", 1, List.of("TypeScript", "Angular"))
        ));
        jobRepository.saveAll(jobPosts);
    }
}
