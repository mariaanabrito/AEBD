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
public class Session {
    
    private int id;
	private String secs_in_wait;
	private String sql_child_number;
	private String sql_id;
	private String status;
	private String osuser;
	private String machine;
	private String module;
	private String command;
	private String type;
	private String timeStamp;

	public Session() {
		
	}
	
	public Session(int id, String secs_in_wait, String sid, String client_info, String serial, String instid, String sql_child_number, String sql_id, String status, String osuser, String machine, String action, String module, String command, String resource_consumer_group) {
		
		super();
		this.id = id;
		this.secs_in_wait = secs_in_wait;
		this.sql_child_number = sql_child_number;
		this.sql_id = sql_id;
		this.status = status;
		this.osuser = osuser;
		this.machine = machine;
		this.module = module;
		this.command = command;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSecs_in_wait() {
		return secs_in_wait;
	}

	public void setSecs_in_wait(String secs_in_wait) {
		this.secs_in_wait = secs_in_wait;
	}

	public String getSql_child_number() {
		return sql_child_number;
	}

	public void setSql_child_number(String sql_child_number) {
		this.sql_child_number = sql_child_number;
	}

	public String getSql_id() {
		return sql_id;
	}

	public void setSql_id(String sql_id) {
		this.sql_id = sql_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOsuser() {
		return osuser;
	}

	public void setOsuser(String osuser) {
		this.osuser = osuser;
	}

	public String getMachine() {
		return machine;
	}

	public void setMachine(String machine) {
		this.machine = machine;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "{\"id\":\"" + id + "\", \"secs_in_wait\":\"" + secs_in_wait + "\", \"sql_child_number\":\"" + sql_child_number + "\", \"sql_id\":\""
			+ sql_id + "\", \"status\":\"" + status + "\", \"osuser\":\"" + osuser + "\", \"machine\":\"" + machine + "\", \"module\":\"" + module 
				+ "\", \"command\":\"" + command + "\", \"timeStamp\":\"" + timeStamp + "\"},";
	}
    
}
