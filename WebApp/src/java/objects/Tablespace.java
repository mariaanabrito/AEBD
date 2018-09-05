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
public class Tablespace {
    
    private int id;
	private String maximumSize;
	private String size;
	private String name;
	private String type;
	private String autoextend;
	private String freeSpace;
	private String timeStamp;
	
	public Tablespace() {
		
	}
	
	public Tablespace(int id, String maximumSize, String size, String name, String type, String autoextend, String freeSpace, String timeStamp) {
		
		super();
		this.id = id;
		this.maximumSize = maximumSize;
		this.size = size;
		this.name = name;
		this.type = type;
		this.autoextend = autoextend;
		this.freeSpace = freeSpace;
		this.timeStamp = timeStamp;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAutoextend() {
		return autoextend;
	}

	public void setAutoextend(String autoextend) {
		this.autoextend = autoextend;
	}

	public String getFreeSpace() {
		return freeSpace;
	}

	public void setFreeSpace(String freeSpace) {
		this.freeSpace = freeSpace;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "{\"id\":\"" + id + "\",\"maximumSize\":\"" + maximumSize + "\",\"size\":\"" + size + "\",\"name\":\"" + name + "\",\"type\":\""
			+ type + "\",\"autoextend\":\"" + autoextend + "\",\"freeSpace\":\"" + freeSpace + "\",\"timestamp\":\"" + timeStamp + "\"},";
	}
    
}
