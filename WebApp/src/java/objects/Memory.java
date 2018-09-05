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
public class Memory {
    
    private int id;
	private String statistic;
	private String sgaPool;
	private String bytes;
	private String timeStamp;
	
	public Memory() {
		
	}
	
	public Memory(int id, String statistic, String sgaPool, String bytes, String timeStamp) {
		
		super();
		this.id = id;
		this.statistic = statistic;
		this.sgaPool = sgaPool;
		this.bytes = bytes;
		this.timeStamp = timeStamp;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatistic() {
		return statistic;
	}

	public void setStatistic(String statistic) {
		this.statistic = statistic;
	}

	public String getSgaPool() {
		return sgaPool;
	}

	public void setSgaPool(String sgaPool) {
		this.sgaPool = sgaPool;
	}

	public String getBytes() {
		return bytes;
	}

	public void setBytes(String bytes) {
		this.bytes = bytes;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "{\"id\":\"" + id + "\", \"statistic\":\"" + statistic + "\", \"sgaPool\":\"" + sgaPool + "\", \"bytes\":\"" + bytes + "\", \"timeStamp\":\"" + timeStamp + "\"},";
	}
    
}
