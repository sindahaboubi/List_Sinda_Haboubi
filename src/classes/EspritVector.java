package classes;

import Interfaces.University;

import java.util.Collections;
import java.util.Vector;


public class EspritVector implements University {
    private Vector<Etudiant> etudiants = new Vector<>();

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
