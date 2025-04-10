package com.javaproject.app.springboot_react_job_app_server.service;

import com.javaproject.app.springboot_react_job_app_server.model.JobPost;
import com.javaproject.app.springboot_react_job_app_server.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public List<JobPost> getAllJobPosts(){
        return jobRepository.getAllJobPosts();
    }

    public JobPost getJobPost(int postId){
        return jobRepository.getJobPost(postId);
    }

    public void addJobPost(JobPost jobPost){
        jobRepository.addJobPost(jobPost);
    }

    public void updateJobPost(JobPost jobPost){
        jobRepository.updateJobPost(jobPost);
    }

    public void deleteJobPost(int postId){
        jobRepository.deleteJobPost(postId);
    }
}
