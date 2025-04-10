package com.javaproject.app.springboot_react_job_app_server.repository;

import com.javaproject.app.springboot_react_job_app_server.model.JobPost;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepository {
    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(101, "Java Developer", "Should know about Java", 1, Arrays.asList("Java", "Spring Boot")),
            new JobPost(102, "React Developer", "Should know about JavaScript", 1, Arrays.asList("JavaScript", "React.js"))
            ));

    public void addJob(JobPost jobPost){
        jobs.add(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return jobs;
    }
}
