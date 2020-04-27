package dti.g25.leo.presentation.modele.mockData;

import java.util.LinkedList;
import java.util.List;

import dti.g25.leo.domaine.entite.Role;
import dti.g25.leo.domaine.entite.Utilisateur;

public class MockDataUtilisateur {

    private static final List<Utilisateur> utilisateurs = new LinkedList<>();

    static {

        Utilisateur utilisateur1 = new Utilisateur(1, "", "Hugo", Role.ETUDIANT);
        Utilisateur utilisateur2 = new Utilisateur(2, "", "Verlaine", Role.ETUDIANT);
        Utilisateur utilisateur3 = new Utilisateur(3, "", "Daudet", Role.ETUDIANT);
        Utilisateur utilisateur4 = new Utilisateur(4, "", "Lafontaine", Role.ENSEIGNANT);

        utilisateurs.add(utilisateur1);
        utilisateurs.add(utilisateur2);
        utilisateurs.add(utilisateur3);
        utilisateurs.add(utilisateur4);
    }

    public static LinkedList<Utilisateur> getUtilisateurs(){
        return (LinkedList<Utilisateur>) utilisateurs;
    }

    public static Utilisateur getUtilisateurParNom(String nom){
        for (Utilisateur unUtilisateur: utilisateurs) {
            if(unUtilisateur.getNom().equals(nom))
                return unUtilisateur;
        }
        return null;
    }





}
