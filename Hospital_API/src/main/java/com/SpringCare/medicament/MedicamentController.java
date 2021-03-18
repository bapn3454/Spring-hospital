package com.SpringCare.medicament;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SpringCare.chambre.Chambre;
import com.SpringCare.medecin.Medecin;

@RestController
public class MedicamentController {

	@RequestMapping("/medicament")
	public String medicaments() {
		return "all medics";
	}
	@RequestMapping(method=RequestMethod.POST,value="/medicament")
	public void addMedecin(@RequestBody Medicament medicament) {
//		ms.addMecedin(med);
		// medicamentservice 
	}
	@RequestMapping("/medicament/{id}")
	public String medicament(@PathVariable String id) {
		return "medic "+id;
	}
	@RequestMapping(method=RequestMethod.PUT,value="/medicament/{id}")
	public void updateMedicament(@RequestBody Medicament medicament,@PathVariable String id) {
//		ms.addMecedin(med);
		// update medicament
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/medicament/{id}")
	public void deleteMedicament(@PathVariable String id) {
//		ms.addMecedin(med);
		// delete medicament
	}
	
}
