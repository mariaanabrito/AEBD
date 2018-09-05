/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author Luismf20
 */
public class User {
    
    private int id;
	private String name;
	private String expirationDate;
	private String creationDate;
	private String common;
	private String accountStatus;
	private String profile;
	private String timeStamp;
	
	public User() {
		
	}
	
	public User(int id, String name, String expirationDate, String creationDate, String common, String accountStatus, String profile, String timeStamp) {
		
		super();
		this.id = id;
		this.name = name;
		this.expirationDate = expirationDate;
		this.creationDate = creationDate;
		this.common = common;
		this.accountStatus = accountStatus;
		this.profile = profile;
		this.timeStamp = timeStamp;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getCommon() {
		return common;
	}

	public void setCommon(String common) {
		this.common = common;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "{\"id\":\"" + id + "\", \"name\":\"" + name + "\", \"expirationDate\":\"" + expirationDate + "\", \"creationDate\":\""
				+ creationDate + "\", \"common\":\"" + common + "\", \"accountStatus\":\"" + accountStatus + "\", \"profile\":\"" + profile + "\", \"timeStamp\":\"" + timeStamp + "\"},";
	}
    
}
