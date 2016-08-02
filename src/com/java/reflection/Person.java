package com.java.reflection;


public class Person {
	
	public String name;
	public String domain;
	public Integer age;
	public String sex;
	
	Person()
	{
		this.name="no name";
		this.domain="no defined";
		this.age=0;
		this.sex="no defined";
	}
	Person(String name,String domain,Integer age,String sex)
	{
		this.name=name;
		this.domain=domain;
		this.age=age;
		this.sex=sex;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
