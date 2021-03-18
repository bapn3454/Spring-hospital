package com.SpringCare.medecin;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SpringCare.patient.Patient;

@RestController
public class MedecinController {

	MedecinService ms = new MedecinService();
	// post
	@RequestMapping("/medecin")
	public List<Medecin> medecins() {
		return ms.getMedecins();
	}
	// put et delete
	@RequestMapping("/medecin/{id}")
	public Medecin getMedecin(@PathVariable String id) {
		return ms.getMedecin(id);
	}
	// ni l'un ni l'autre
	@RequestMapping("/medecin/{id}/patient")
	public Medecin getPatientByMedecin(@PathVariable String id) {
		return ms.getMedecin(id);
		// changer le retour
	}
	@RequestMapping(method=RequestMethod.POST,value="/medecin")
	public void addMedecin(@RequestBody Medecin med) {
		ms.addMecedin(med);
	}
	@RequestMapping(method=RequestMethod.POST,value="/medecin/patient")
	public void addPatientPerMedecin(@RequestBody Patient patient) {
		// change the patientservice
		// check if there is a better ways to add the cardinalities in jpa
		//ms.addMecedin(med);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/medecin/{id}")
	public void updateMedecin(@RequestBody Medecin med,@PathVariable String id) {
//		ms.addMecedin(med);
		// update medecin
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/medecin/{id}")
	public void deleteMedecin(@PathVariable String id) {
//		ms.addMecedin(med);
		// delete medecin
	}

}
