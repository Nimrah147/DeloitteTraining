package com.registertask.model;

public class User {
	private String firstName;
	private String lastName;
	private long mobileNo;
	private String gender;
	private String userName;
	private String password;
	public User(String firstName, String lastName, long mobileNo, String gender, String userName, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.userName = userName;
		this.password = password;
	}
	public User() {
		super();
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
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() { 
	//overriding the predefined toString() method
	//to convert the details of the object into string type
	return "User [First Name = " + firstName + ", Last Name = " + lastName + ", Mobile No = " + mobileNo
			+ ", gender = " + gender + "]";
	}
	
	
	
	
	
}
