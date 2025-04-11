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

    @GetMapping(path = "jobPosts", produces = "application/json")
    public List<JobPost> getJobPosts(){
        return jobService.getAllJobPosts();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJobPostById(@PathVariable("postId") int postId){
        return jobService.getJobPost(postId);
    }

    @PostMapping(path = "jobPost", consumes = "application/xml")
    public JobPost addJobPost(@RequestBody JobPost jobPost){
        jobService.addJobPost(jobPost);
        return jobService.getJobPost(jobPost.getPostId());
    }

    @PutMapping("jobPost")
    public JobPost updateJobPost(@RequestBody JobPost jobPost){
        jobService.updateJobPost(jobPost);
        return jobService.getJobPost(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJobPost(@PathVariable int postId){
        jobService.deleteJobPost(postId);
        return "Job Post Deleted";
    }

    @PostMapping("load")
    public String load(){
        jobService.load();
        return "Data Loaded";
    }

    @GetMapping("jobPost/keyword/{keyword}")
    public List<JobPost> getJobPostByKeyword(@PathVariable("keyword") String keyword){
        return jobService.getJobPostByKeyword(keyword);
    }
}
