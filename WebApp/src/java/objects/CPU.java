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
public class CPU {
    
    private int id;
	private String dbid;
	private String cpu_core_count;
	private String cpu_count;
	private String timeStamp_cpu;
	private String version;
	private String cpu_socket_count;
	private String timeStamp;
	
	public CPU() {
		
	}
	
	public CPU (int id, String dbid, String cpu_core_count, String cpu_count, String timeStamp_cpu, String version, String cpu_socket_count, String timeStamp) {
		
		super();
		this.id = id;
		this.cpu_core_count = cpu_core_count;
		this.cpu_count = cpu_count;
		this.timeStamp_cpu = timeStamp_cpu;
		this.version = version;
		this.cpu_socket_count = cpu_socket_count;
		this.timeStamp = timeStamp;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDbid() {
		return dbid;
	}

	public void setDbid(String dbid) {
		this.dbid = dbid;
	}

	public String getCpu_core_count() {
		return cpu_core_count;
	}

	public void setCpu_core_count(String cpu_core_count) {
		this.cpu_core_count = cpu_core_count;
	}

	public String getCpu_count() {
		return cpu_count;
	}

	public void setCpu_count(String cpu_count) {
		this.cpu_count = cpu_count;
	}

	public String getTimeStamp_cpu() {
		return timeStamp_cpu;
	}

	public void setTimeStamp_cpu(String timeStamp_cpu) {
		this.timeStamp_cpu = timeStamp_cpu;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getCpu_socket_count() {
		return cpu_socket_count;
	}

	public void setCpu_socket_count(String cpu_socket_count) {
		this.cpu_socket_count = cpu_socket_count;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "{\"id\":\"" + id + "\",\"dbid\":\"" + dbid + "\",\"cpu_core_count\":\"" + cpu_core_count + "\",\"cpu_count\":\"" + cpu_count
		        + "\",\"timeStamp_cpu\":\"" + timeStamp_cpu + "\",\"version\":\"" + version + "\",\"cpu_socket_count\":\"" + cpu_socket_count
                        + "\",\"timeStamp\":\"" + timeStamp + "\"},";
	}
    
}
