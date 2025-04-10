package com.javaproject.app.springboot_react_job_app_server.Controller;

import com.javaproject.app.springboot_react_job_app_server.model.JobPost;
import com.javaproject.app.springboot_react_job_app_server.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId){
        return jobService.getJob(postId);
    }

    @PostMapping("jobPost")
    public JobPost getJobPost(@RequestBody JobPost jobPost){
        jobService.addJob(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }
}
