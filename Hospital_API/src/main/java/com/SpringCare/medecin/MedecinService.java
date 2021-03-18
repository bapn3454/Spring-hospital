package com.SpringCare.medecin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class MedecinService {

	private List<Medecin> medecins = new ArrayList(Arrays.asList(new Medecin("1","aaa","bbb","cardiologie"),
			new Medecin("2","ccc","ddd","cancerologie"),
			new Medecin("3","eee","fff","pediatrie")));

	public List<Medecin> getMedecins() {
		return medecins;
	}

	public void setMedecins(List<Medecin> medecins) {
		this.medecins = medecins;
	}
	public Medecin getMedecin(String id) {
		return medecins.stream().filter(m -> m.getId().equals(id)).findFirst().get();
	}
	public void addMecedin(Medecin m) {
		medecins.add(m);
	}
}
