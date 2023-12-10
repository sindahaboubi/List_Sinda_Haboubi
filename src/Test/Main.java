package Test;

import Interfaces.University;
import classes.EspritArrayList;
import classes.EspritVector;
import classes.Etudiant;

public class Main {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant(1, "Haboubi", "Sinda");
        Etudiant etudiant2 = new Etudiant(2, "Rabhi", "Mariem");
        Etudiant etudiant3 = new Etudiant(3, "Msahli", "Aziz");

        etudiant2.setNom("Makni");
        System.out.println("Le nom de l'étudiant N°2 est: " + etudiant2.getNom());

        System.out.println("Les étudiants 2 et 3 sont-ils égaux selon l'id ? : " + etudiant2.equals(etudiant3));

        System.out.println("Etudiant 1 : " + etudiant1.toString());
        System.out.println("Etudiant 2 : " + etudiant2.toString());
        System.out.println("Etudiant 3 : " + etudiant3.toString());
        
        University espritVector = new EspritVector();
        Etudiant etudiant4 = new Etudiant(4, "Halloul", "NourAllah");
        Etudiant etudiant5 = new Etudiant(5, "Kamoun", "Riadh");

        espritVector.ajouterEtudiant(etudiant1);
        espritVector.ajouterEtudiant(etudiant3);
        espritVector.ajouterEtudiant(etudiant2);
        espritVector.ajouterEtudiant(etudiant5);
        espritVector.ajouterEtudiant(etudiant4);
        espritVector.trierEtudiantsParId();
        
        System.out.println("Les étudiants dans 'EspritVector' sont :");
        espritVector.displayEtudiants();

        System.out.println("L'étudiant dont son nom est 'Haboubi' existe-il dans EspritVector? : " + espritVector.rechercherEtudiant("Haboubi"));
        
        University espritArrayList = new EspritArrayList();
        Etudiant etudiant6 = new Etudiant(6, "Gharsallah", "Sirine");
        Etudiant etudiant7 = new Etudiant(7, "Khmiri", "Nawres");
        
        espritArrayList.ajouterEtudiant(etudiant5);
        espritArrayList.ajouterEtudiant(etudiant6);
        espritArrayList.ajouterEtudiant(etudiant7);
        espritArrayList.trierEtudiantsParNom();

        System.out.println("Les étudiants dans EspritArrayList sont :");
        espritArrayList.displayEtudiants();
        System.out.println("L'étudiant dont son id est '4' existe-il dans EspritArrayList? : " + espritArrayList.rechercherEtudiant(etudiant4));
        espritArrayList.supprimerEtudiant(etudiant6);
        System.out.println("La liste des étudiants après la supression de l'étudiant 6 est :");
        espritArrayList.displayEtudiants();
    }
}
