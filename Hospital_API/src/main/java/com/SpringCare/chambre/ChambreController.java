package com.SpringCare.chambre;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SpringCare.medecin.Medecin;

@RestController
public class ChambreController {

	@RequestMapping("/chambre")
	public String chambres() {
		return "all chambres";
	}
	@RequestMapping(method=RequestMethod.POST,value="/chambre")
	public void addMedecin(@RequestBody Chambre chambre) {
//		ms.addMecedin(med);
		// chambreservice
	}
	@RequestMapping("/chambre/{id}")
	public String chambre(@PathVariable String id) {
		return "chambre "+id;
	}
	@RequestMapping(method=RequestMethod.PUT,value="/chambre/{id}")
	public void updateChambre(@RequestBody Chambre chambre,@PathVariable String id) {
//		ms.addMecedin(med);
		// update chambre
	}
	// la prochaine methode ne sert pas vraiment
	@RequestMapping(method=RequestMethod.DELETE,value="/chambre/{id}")
	public void deleteChambre(@PathVariable String id) {
//		ms.addMecedin(med);
		// delete chambre
	}
	
}
