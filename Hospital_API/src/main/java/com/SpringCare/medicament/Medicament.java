package com.SpringCare.medicament;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Medicament {
	@Id
	private String id;
	private String datefab;
	private String dateper;
	private String nom;
	public Medicament(String id, String datefab, String dateper, String nom) {
		super();
		this.id = id;
		this.datefab = datefab;
		this.dateper = dateper;
		this.nom = nom;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDatefab() {
		return datefab;
	}
	public void setDatefab(String datefab) {
		this.datefab = datefab;
	}
	public String getDateper() {
		return dateper;
	}
	public void setDateper(String dateper) {
		this.dateper = dateper;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
