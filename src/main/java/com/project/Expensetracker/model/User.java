package com.project.Expensetracker.model;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User {

    @Id
    private int userId;
    private String userName;
    private String userOccupation;
    private String userCountry;
    private String userGender;
    private Date userDob;
    private String userAddress;
    private float userMonthlyIncome;
    private float userYearlyIncome;
    private String userPfp;
    private boolean userActive;
    private String userPermissions;
    private Date userCreationDate;
    private Date userLastLogin;
    
	public User() {
		super();
	}

	public User(int userId, String userName, String userOccupation, String userCountry, String userGender,
			Date userDob, String userAddress, float userMonthlyIncome, float userYearlyIncome, String userPfp,
			boolean userActive, String userPermissions, Date userCreationDate, Date userLastLogin) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userOccupation = userOccupation;
		this.userCountry = userCountry;
		this.userGender = userGender;
		this.userDob = userDob;
		this.userAddress = userAddress;
		this.userMonthlyIncome = userMonthlyIncome;
		this.userYearlyIncome = userYearlyIncome;
		this.userPfp = userPfp;
		this.userActive = userActive;
		this.userPermissions = userPermissions;
		this.userCreationDate = userCreationDate;
		this.userLastLogin = userLastLogin;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserOccupation() {
		return userOccupation;
	}

	public void setUserOccupation(String userOccupation) {
		this.userOccupation = userOccupation;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public Date getUserDob() {
		return userDob;
	}

	public void setUserDob(Date userDob) {
		this.userDob = userDob;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public float getUserMonthlyIncome() {
		return userMonthlyIncome;
	}

	public void setUserMonthlyIncome(float userMonthlyIncome) {
		this.userMonthlyIncome = userMonthlyIncome;
	}

	public float getUserYearlyIncome() {
		return userYearlyIncome;
	}

	public void setUserYearlyIncome(float userYearlyIncome) {
		this.userYearlyIncome = userYearlyIncome;
	}

	public String getUserPfp() {
		return userPfp;
	}

	public void setUserPfp(String userPfp) {
		this.userPfp = userPfp;
	}

	public boolean isUserActive() {
		return userActive;
	}

	public void setUserActive(boolean userActive) {
		this.userActive = userActive;
	}

	public String getUserPermissions() {
		return userPermissions;
	}

	public void setUserPermissions(String userPermissions) {
		this.userPermissions = userPermissions;
	}

	public Date getUserCreationDate() {
		return userCreationDate;
	}

	public void setUserCreationDate(Date userCreationDate) {
		this.userCreationDate = userCreationDate;
	}

	public Date getUserLastLogin() {
		return userLastLogin;
	}

	public void setUserLastLogin(Date userLastLogin) {
		this.userLastLogin = userLastLogin;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userOccupation=" + userOccupation
				+ ", userCountry=" + userCountry + ", userGender=" + userGender + ", userDob=" + userDob
				+ ", userAddress=" + userAddress + ", userMonthlyIncome=" + userMonthlyIncome + ", userYearlyIncome="
				+ userYearlyIncome + ", userPfp=" + userPfp + ", userActive=" + userActive + ", userPermissions="
				+ userPermissions + ", userCreationDate=" + userCreationDate + ", userLastLogin=" + userLastLogin + "]";
	}


}
