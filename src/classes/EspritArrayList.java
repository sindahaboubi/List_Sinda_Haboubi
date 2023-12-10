package classes;

import java.util.ArrayList;
import java.util.Collections;

import Interfaces.University;

public class EspritArrayList implements University {
    private ArrayList<Etudiant> etudiants = new ArrayList<>();

	@Override
	public void ajouterEtudiant(Etudiant e) {
		etudiants.add(e);
	}

	@Override
	public boolean rechercherEtudiant(Etudiant e) {
		return etudiants.contains(e);
	}

	@Override
	public boolean rechercherEtudiant(String nom) {
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
	}

	@Override
	public void supprimerEtudiant(Etudiant e) {
		etudiants.remove(e);
	}

	@Override
	public void displayEtudiants() {
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant.toString());
        }
	}

	@Override
	public void trierEtudiantsParId() {
        Collections.sort(etudiants, (e1, e2) -> Integer.compare(e1.getId(), e2.getId()));
	}

	@Override
	public void trierEtudiantsParNom() {
        Collections.sort(etudiants, (e1, e2) -> e1.getNom().compareTo(e2.getNom()));
	}

}
