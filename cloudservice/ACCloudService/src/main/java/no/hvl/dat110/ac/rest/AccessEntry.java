package no.hvl.dat110.ac.rest;

public class AccessEntry {

	private Integer id;
	private String message;
	
	public AccessEntry(int id, String message) {
		this.id = id;
		this.message = message;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}
