package com.maharshi.JobPortalRestApi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maharshi.JobPortalRestApi.model.JobPost;

public interface JobRepository extends JpaRepository<JobPost,Integer> {

	List<JobPost> findByjobprofileContainingOrJobDescriptionContaining(String keyword,String Keyword);


}
