package com.maharshi.JobPortalRestApi.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.maharshi.JobPortalRestApi.model.JobPost;

@Repository
public class JobRepo {
	
	List<JobPost> jobs = new ArrayList<>(Arrays.asList(
		    new JobPost(1, "Java Developer", "Develop Java backend services", 3, Arrays.asList("Java", "Spring", "Hibernate")),
		    new JobPost(2, "Frontend Developer", "Work on React UI", 2, Arrays.asList("JavaScript", "React", "CSS")),
		    new JobPost(3, "Data Engineer", "Build data pipelines", 4, Arrays.asList("Python", "Spark", "Kafka")),
		    new JobPost(4, "DevOps Engineer", "Manage CI/CD and cloud infra", 5, Arrays.asList("Docker", "Kubernetes", "AWS")),
		    new JobPost(5, "QA Engineer", "Automate testing", 2, Arrays.asList("Selenium", "Java", "JUnit")),
		    new JobPost(6, "Mobile Developer", "Develop Android apps", 3, Arrays.asList("Java", "Kotlin", "Android SDK")),
		    new JobPost(7, "Business Analyst", "Gather requirements and analyze", 3, Arrays.asList("JIRA", "Confluence", "Excel")),
		    new JobPost(8, "Product Manager", "Lead product strategy", 6, Arrays.asList("Roadmap", "Agile", "Communication")),
		    new JobPost(9, "Database Administrator", "Manage Oracle DB", 5, Arrays.asList("Oracle", "SQL", "Backup")),
		    new JobPost(10, "Cloud Architect", "Design cloud infrastructure", 7, Arrays.asList("AWS", "Azure", "Terraform"))
		));

	
	public List<JobPost> getAllJobs() {
		return jobs;
	}


	public JobPost getJob(int postId) {
		for (JobPost jobPost : jobs) {
			if(jobPost.getJobId()==postId)
			{
				return jobPost;
			}
		}
		return null;
	}


	public void addJob(JobPost jp) {
		jobs.add(jp);
		
	}


	public void updateJob(JobPost jp) {
		for (JobPost jobPost : jobs) {
			if(jobPost.getJobId()==jp.getJobId())
			{
				jobPost.setJobprofile(jp.getJobprofile());
				jobPost.setJobDescription(jp.getJobDescription());
				jobPost.setJobTechStack(jp.getJobTechStack());
				jobPost.setReqworkExp(jp.getReqworkExp());
			}
		}
		
		
	}


	public void deleteJob(int postId) {
		JobPost jp = new JobPost();
		for (JobPost jobPost : jobs) {
			if(jobPost.getJobId()==postId)
			{
				jp= jobPost;
			}
		}
		jobs.remove(jp);
		
	}

}
