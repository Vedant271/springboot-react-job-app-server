package com.javaproject.app.springboot_react_job_app_server.Controller;

import com.javaproject.app.springboot_react_job_app_server.model.JobPost;
import com.javaproject.app.springboot_react_job_app_server.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobController {
    @Autowired
    private JobService jobService;

    @GetMapping("jobPosts")
    public List<JobPost> postJobs(){
        return jobService.getAllJobs();
    }
}
