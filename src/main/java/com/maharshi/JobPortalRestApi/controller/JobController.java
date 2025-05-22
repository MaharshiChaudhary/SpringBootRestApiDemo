package com.maharshi.JobPortalRestApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.maharshi.JobPortalRestApi.model.JobPost;
import com.maharshi.JobPortalRestApi.service.Jobservice;

@RestController
public class JobController {
	@Autowired
	Jobservice service;
	//@GetMapping(path = "jobposts", produces = {"application/xml"}) restriction XML / JSON type
	@GetMapping("jobposts")
	public List<JobPost> getAllJobs() {
		return service.getAllJobs();
		
	}
	
	@GetMapping("jobpost/{postId}")
	public JobPost getJob(@PathVariable("postId") int postId) {
		return service.getJob(postId);
		
	}
	//@PostMapping(path="jobpost",consumes= {"application/xml"}) for restriction
	@PostMapping("jobpost")
	public JobPost addJob(@RequestBody JobPost jp) {
		service.addJob(jp);
		return service.getJob(jp.getJobId());
		
	}
	
	@PutMapping("jobpost")
	public JobPost updateJob(@RequestBody JobPost jp) {
		service.updateJob(jp);
		return service.getJob(jp.getJobId());
		
	}
	@DeleteMapping("jobpost/{postId}")
	public String deleteJob(@PathVariable("postId") int postId) {
		service.deleteJob(postId);
		return "Deleted";
		
	}
	

}
