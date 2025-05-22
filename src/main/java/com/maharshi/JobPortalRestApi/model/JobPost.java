package com.maharshi.JobPortalRestApi.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class JobPost {
	
	int jobId;
	String jobprofile;
	String jobDescription;
	int reqworkExp;
	List<String> jobTechStack;
	@Override
	public String toString() {
		return "JobPost [jobId=" + jobId + ", jobprofile=" + jobprofile + ", jobDescription=" + jobDescription
				+ ", reqworkExp=" + reqworkExp + ", jobTechStack=" + jobTechStack + "]";
	}
	public JobPost() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JobPost(int jobId, String jobprofile, String jobDescription, int reqworkExp, List<String> jobTechStack) {
		super();
		this.jobId = jobId;
		this.jobprofile = jobprofile;
		this.jobDescription = jobDescription;
		this.reqworkExp = reqworkExp;
		this.jobTechStack = jobTechStack;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getJobprofile() {
		return jobprofile;
	}
	public void setJobprofile(String jobprofile) {
		this.jobprofile = jobprofile;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public int getReqworkExp() {
		return reqworkExp;
	}
	public void setReqworkExp(int reqworkExp) {
		this.reqworkExp = reqworkExp;
	}
	public List<String> getJobTechStack() {
		return jobTechStack;
	}
	public void setJobTechStack(List<String> jobTechStack) {
		this.jobTechStack = jobTechStack;
	}
	
	
	

}
