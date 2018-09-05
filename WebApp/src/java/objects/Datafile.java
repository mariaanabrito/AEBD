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
public class Datafile {
    
    private int id;
	private String freeSpace;
	private String autoExtend;
	private String name;
	private String status;
	private String maximumSize;
	private String size;
	private String timeStamp;
	
	public Datafile() {
		
	}
	
	public Datafile(int id, String freeSpace, String autoExtend, String name, String status, String maximumSize, String size, String timeStamp) {
		
		super();
		this.id = id;
		this.freeSpace = freeSpace;
		this.autoExtend = autoExtend;
		this.name = name;
		this.status = status;
		this.maximumSize = maximumSize;
		this.size = size;
		this.timeStamp = timeStamp;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFreeSpace() {
		return freeSpace;
	}

	public void setFreeSpace(String freeSpace) {
		this.freeSpace = freeSpace;
	}

	public String getAutoExtend() {
		return autoExtend;
	}

	public void setAutoExtend(String autoExtend) {
		this.autoExtend = autoExtend;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMaximumSize() {
		return maximumSize;
	}

	public void setMaximumSize(String maximumSize) {
		this.maximumSize = maximumSize;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "{\"id\":\"" + id + "\", \"freeSpace\":\"" + freeSpace + "\", \"autoExtend\":\"" + autoExtend + "\", \"name\":\"" + name
                        + "\", \"status\":\"" + status + "\", \"maximumSize\":\"" + maximumSize + "\", \"size\":\"" + size + "\", \"timeStamp\":\"" + timeStamp + "\"},";
	}
    
}
