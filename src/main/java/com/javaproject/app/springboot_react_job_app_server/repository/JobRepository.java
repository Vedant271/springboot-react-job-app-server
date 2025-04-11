package com.javaproject.app.springboot_react_job_app_server.repository;

import com.javaproject.app.springboot_react_job_app_server.model.JobPost;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface JobRepository extends JpaRepository<JobPost, Integer> {

}

//List<JobPost> jobPosts = new ArrayList<>(List.of(
//        new JobPost(101, "Java Developer", "Should know about Java", 1, List.of("Java", "Spring Boot")),
//        new JobPost(102, "React Developer", "Should know about JavaScript", 1, List.of("JavaScript", "React.js")),
//        new JobPost(103, "Angular Developer", "Should know about TypeScript", 1, List.of("TypeScript", "Angular"))
//));
//
//public List<JobPost> getAllJobPosts(){
//    return jobPosts;
//}
//
//public JobPost getJobPost(int postId){
//    for(JobPost jobPostGet : jobPosts){
//        if(jobPostGet.getPostId()==postId){
//            return jobPostGet;
//        }
//    }
//    return null;
//}
//
//public void addJobPost(JobPost jobPost){
//    jobPosts.add(jobPost);
//}
//
//public void updateJobPost(JobPost jobPost){
//    for(JobPost jobPostUpdate : jobPosts){
//        if(jobPostUpdate.getPostId() == jobPost.getPostId()){
//            jobPostUpdate.setPostDesc(jobPost.getPostDesc());
//            jobPostUpdate.setPostProfile(jobPost.getPostProfile());
//            jobPostUpdate.setReqExperience(jobPost.getReqExperience());
//            jobPostUpdate.setPostTechStack(jobPost.getPostTechStack());
//        }
//    }
//}
//
//public void deleteJobPost(int postId){
//    for(JobPost jobPostDelete : jobPosts){
//        if(jobPostDelete.getPostId() == postId){
//            jobPosts.remove(jobPostDelete);
//        }
//    }
//}
