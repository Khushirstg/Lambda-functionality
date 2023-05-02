package com.example.lambda.entity;

public class stud {



    private String firstName;
    private String lastName;
    private int age;
    private String department;
    private String fullName;
    
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public stud(String firstName, String lastName, int age, String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.department = department;
	}
	public stud() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}