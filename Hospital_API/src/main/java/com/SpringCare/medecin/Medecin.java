package com.SpringCare.medecin;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Medecin {
	@Id
	private String id;
	private String nom;
	private String prenom;
	private String specialite;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public Medecin(String id, String nom, String prenom, String specialite) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.specialite = specialite;
	}
	
	
	
}
