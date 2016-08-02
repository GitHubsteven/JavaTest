package com.java.reflection;

public class ITworker extends Person {
	
	public String jobDomain;
	public Integer workAge;
	public String getJobDomain() {
		return jobDomain;
	}
	ITworker()
	{}
	
	ITworker(String job,Integer workage)
	{
		super();
		this.jobDomain=job;
		this.workAge=workage;
	}
	
	ITworker(String jobdomain)
	{
		this.jobDomain=jobdomain;
	}
	
	public void setJobDomain(String jobDomain) {
		this.jobDomain = jobDomain;
	}
	public Integer getWorkAge() {
		return workAge;
	}
	public void setWorkAge(Integer workAge) {
		this.workAge = workAge;
	}
	
	@SuppressWarnings("unused")
	private void itstate()
	{
		System.out.println("hello, i am a itworker, and i want to be a good, very goog worker");
	}
	public String toString()
	{
		return this.jobDomain+"   "+this.workAge;
	}
}
