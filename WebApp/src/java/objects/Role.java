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
public class Role {
    
    private int id;
	private String role;
	private String common;
	private String authentication_type;
	private String timeStamp;
	
	public Role() {
		
	}
	
	public Role(int id, String role, String common, String authentication_type, String timeStamp) {
		
		super();
		this.id = id;
		this.role = role;
		this.common = common;
		this.authentication_type = authentication_type;
		this.timeStamp = timeStamp;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCommon() {
		return common;
	}

	public void setCommon(String common) {
		this.common = common;
	}

	public String getAuthentication_type() {
		return authentication_type;
	}

	public void setAuthentication_type(String authentication_type) {
		this.authentication_type = authentication_type;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "{\"id\":\"" + id + "\", \"role\":\"" + role + "\", \"common\":\"" + common + "\", \"authentication_type\":\"" + authentication_type + "\", \"timeStamp\":\"" + timeStamp + "\"},";
	}
    
}
