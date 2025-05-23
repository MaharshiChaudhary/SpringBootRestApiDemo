package com.maharshi.JobPortalRestApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maharshi.JobPortalRestApi.model.JobPost;

public interface JobRepository extends JpaRepository<JobPost,Integer> {

}
