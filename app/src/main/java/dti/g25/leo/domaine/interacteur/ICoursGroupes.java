package dti.g25.leo.domaine.interacteur;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;

import dti.g25.leo.domaine.entite.Cours;
import dti.g25.leo.domaine.entite.Groupe;
import dti.g25.leo.domaine.entite.Horaire;
import dti.g25.leo.domaine.entite.Seance;
import dti.g25.leo.domaine.entite.Utilisateur;
import dti.g25.leo.presentation.modele.mockData.CoursGroupe;
import dti.g25.leo.presentation.modele.mockData.MockDataCoursGroupe;

@RequiresApi(api = Build.VERSION_CODES.O)
public class ICoursGroupes {

    private ArrayList<CoursGroupe> listCoursGroupe = MockDataCoursGroupe.getCoursGroupes();

    /**
     * Genere une liste de Cours avec toutes les informations sous jacantes
     * @return ArrayList<Cours> : liste d'objet Cours
     */
    public ArrayList<Cours> generationListeCours(){
        ArrayList<Cours> listeCours = new ArrayList<>();

        for (CoursGroupe unCoursGroupe: listCoursGroupe) {
            ArrayList<Seance> sceancesAjouter = unCoursGroupe.get_seances();
            Cours coursAjouter = new Cours(unCoursGroupe.getSigle(), unCoursGroupe.getTitre(), "une description", new ArrayList<Groupe>());
            Groupe groupeAjouter = new Groupe( unCoursGroupe.getNumero() , new ArrayList<Horaire>() , new ArrayList<Seance>(), new ArrayList<Utilisateur>());
            // Création de chaque Cours avec sigle unique
            if(listeCours.size() > 0){
                Boolean estPresent = false;
                if(indexCoursParSigle(listeCours, coursAjouter) != -1)
                    estPresent = true;
//
                if(!estPresent){
                    groupeAjouter.setSeances(sceancesAjouter);
                    coursAjouter = ajouterGroupe(coursAjouter, groupeAjouter);
                    listeCours.add(coursAjouter);
                } else {
                    int indexCours = indexCoursParSigle(listeCours, coursAjouter);
                    Cours coursModifier = listeCours.get(indexCours);
                    ArrayList<Seance> seances = groupeAjouter.getSeances();
                    seances.addAll(sceancesAjouter);
                    groupeAjouter.setSeances(seances);
                    coursModifier = ajouterGroupe(coursModifier, groupeAjouter);
                    listeCours.set(indexCours, coursModifier);
                }
            } else {
                groupeAjouter.setSeances(sceancesAjouter);
                coursAjouter = ajouterGroupe(coursAjouter, groupeAjouter);
                listeCours.add(coursAjouter);
            }
        }



        return listeCours;
    }

    private int indexCoursParSigle (ArrayList<Cours> cours, Cours coursRecherche){
        for (int i=0; i<cours.size(); i++) {
            if(cours.get(i).getSigle().equals(coursRecherche.getSigle()))
                return i;
        }
        return -1;
    }

    private int indexGroupeParNumero (ArrayList<Groupe> groupes, Groupe groupeRecherche){
        for (int i=0; i<groupes.size(); i++) {
            if(groupes.get(i).getNo() == groupeRecherche.getNo())
                return i;
        }
        return -1;
    }

    private Cours ajouterGroupe (Cours unCours, Groupe unGroupeAjouter){
        if(unCours.getGroupes().size() == 0)
            unCours.addGroupe(unGroupeAjouter);
        else {
            Boolean estPresent = false;
            if(indexGroupeParNumero(unCours.getGroupes(), unGroupeAjouter) != -1)
                estPresent = true;
            if(!estPresent)
                unCours.addGroupe(unGroupeAjouter);
        }

        return unCours;
    }




}
