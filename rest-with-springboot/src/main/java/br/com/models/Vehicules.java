package br.com.models;

public class Vehicules {
	private long id;
	private String model;

	public Vehicules(long id, String model) {
		super();
		this.id = id;
		this.model = model;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
