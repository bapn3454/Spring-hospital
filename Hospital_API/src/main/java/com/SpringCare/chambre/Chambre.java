package com.SpringCare.chambre;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Chambre {
	@Id
	private String id;

	public Chambre(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
