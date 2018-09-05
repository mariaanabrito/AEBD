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
public class Privilege {
    
    private int id;
	private String property;
	private String privilege;
	private String timeStamp;
	
	public Privilege() {
		
	}
	
	public Privilege(int id, String property, String privilege, String timeStamp) {
		
		super();
		this.id = id;
		this.property = property;
		this.privilege = privilege;
		this.timeStamp = timeStamp;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "{\"id\":\"" + id + "\", \"property\":\"" + property + "\", \"privilege\":\"" + privilege + "\", \"timeStamp\":\"" + timeStamp + "\"},";
	}
    
}
