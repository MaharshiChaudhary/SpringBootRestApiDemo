package com.maharshi.JobPortalRestApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maharshi.JobPortalRestApi.model.JobPost;
import com.maharshi.JobPortalRestApi.repo.JobRepo;

@Service
public class Jobservice {

	@Autowired
	JobRepo repo;
	
	public List<JobPost> getAllJobs() {
		return repo.getAllJobs();
	}

	public JobPost getJob(int postId) {
		// TODO Auto-generated method stub
		return repo.getJob(postId);
	}

	public void addJob(JobPost jp) {
		repo.addJob(jp);
		
	}

	public void updateJob(JobPost jp) {
		repo.updateJob(jp);
		
	}

	public void deleteJob(int postId) {
		repo.deleteJob(postId);
		
	}

}
