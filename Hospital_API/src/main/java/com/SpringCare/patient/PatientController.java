package com.SpringCare.patient;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SpringCare.chambre.Chambre;
import com.SpringCare.medecin.Medecin;
import com.SpringCare.medicament.Medicament;

@RestController
public class PatientController {
	
	@RequestMapping("/patient")
	public String patients() {
		return "all patients";
	}
	@RequestMapping(method=RequestMethod.POST,value="/patient")
	public void addMedecin(@RequestBody Patient patient) {
//		ms.addMecedin(med);
		// patientservice 
	}
	@RequestMapping("/patient/{id}")
	public String patient(@PathVariable String id) {
		return "patient "+id;
	}
	@RequestMapping("/patient/{id}/medics")
	public String medicsByPatient(@PathVariable String id) {
		return "patient "+id;
	}
	@RequestMapping(method=RequestMethod.POST,value="/patient/{id}/medics")
	public void addMedicPerPatient(@RequestBody Medicament medicament) {
//		ms.addMecedin(med);
		// medicamentservice et jpa
	}
	// ici on pourrait aussi avoir "patient/id/medics/id" et y montrer les informations par rapport à un client particulier
	// et un medic .. genre les heures et les quantites pour les prendre .. mais faudrait se renseigner sur jpa d'abbord
	@RequestMapping("/patient/{id}/chambre")
	public String chambreByPatient(@PathVariable String id) {
		return "patient "+id;
	}
	@RequestMapping(method=RequestMethod.POST,value="/patient/{id}/chambre")
	public void addChambrePerPatient(@RequestBody Chambre chambre) {
//		ms.addMecedin(med);
		// patientservice jpa et aussi la coherence de cette url
	}
	@RequestMapping(method=RequestMethod.PUT,value="/patient/{id}")
	public void updatePatient(@RequestBody Patient patient,@PathVariable String id) {
//		ms.addMecedin(med);
		// update patient
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/patient/{id}")
	public void deletePatient(@PathVariable String id) {
//		ms.addMecedin(med);
		// delete patient
	}
}
