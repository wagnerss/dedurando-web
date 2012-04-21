package br.com.dedurando.bean;

public enum StatusType {
	
	ACTIVE(1),	INACTIVE(0);
	
	private int status;
 
	private StatusType(int status) {
		this.status = status;
	}
 
	public int getStatus() {
		return status;
	}
	
}
