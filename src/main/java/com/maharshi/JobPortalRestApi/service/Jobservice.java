package com.maharshi.JobPortalRestApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maharshi.JobPortalRestApi.model.JobPost;
import com.maharshi.JobPortalRestApi.repo.JobRepo;
import com.maharshi.JobPortalRestApi.repo.JobRepository;

@Service
public class Jobservice {

	@Autowired
	JobRepository repo;
	
	public List<JobPost> getAllJobs() {
		return repo.findAll();
	}

	public JobPost getJob(int postId) {
		// TODO Auto-generated method stub
		return repo.findById(postId).orElse(null);
	}

	public void addJob(JobPost jp) {
		repo.save(jp);
		
	}

	public void updateJob(JobPost jp) {
		repo.save(jp);
		
	}

	public void deleteJob(int postId) {
		repo.deleteById(postId);
		
	}

	public List<JobPost> serchByKeyword(String keyword) {
		return repo.findByjobprofileContainingOrJobDescriptionContaining(keyword,keyword);
	}

}
