package com.ssafy;

public class Person {
	
	private String name;
	private int age;
	private String job;

    public Person() {
	}

	public Person(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}

	public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
    	this.age = age;
    }
    
    public void setJob(String job) {
    	this.job = job;
    }
	
    public String getJob() {
		return job;
	}
	
    public String getName() {
		return name;
	}
	
    public int getAge() {
		return age;
	}
	
    public String toString() {
    	// to접두사 붙은 메소드 : 변환 메소드
    	// 자바 toString()메소드 : 객체에 대한 상태를 표현하는 메소드
    	return "hiroo";
    }
}
