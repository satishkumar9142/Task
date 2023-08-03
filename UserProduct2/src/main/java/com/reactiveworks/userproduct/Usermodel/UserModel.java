package com.reactiveworks.userproduct.Usermodel;
/**
 * 
 * Model class for User.
 *
 */
public class UserModel {
	private String userId;
	private String userName;
	private String phoneNo;
	private String emailId;
	private String city;

	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "[userId=" + userId + ", userName=" + userName + ", phoneNo=" + phoneNo + ", emailId=" + emailId
				+ ", city=" + city + "]";
	}
}
