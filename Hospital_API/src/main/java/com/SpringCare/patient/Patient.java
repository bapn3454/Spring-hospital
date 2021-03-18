package com.SpringCare.patient;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Patient {
	@Id
	private String id;
	private String nom;
	private String prenom;
	private String age;
	// les listes ne passent pas sur jpa
	//private List maladies;
	public Patient(String id, String nom, String prenom, String age) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	
}
