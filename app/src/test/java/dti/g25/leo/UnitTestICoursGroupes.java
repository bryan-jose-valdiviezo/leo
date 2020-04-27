package dti.g25.leo;

import org.junit.Test;

import java.util.ArrayList;

import dti.g25.leo.domaine.entite.Cours;
import dti.g25.leo.domaine.entite.Groupe;
import dti.g25.leo.domaine.entite.Seance;
import dti.g25.leo.presentation.modele.mockData.ICoursGroupes;
import dti.g25.leo.presentation.modele.mockData.MockDataSeance;

import static org.junit.Assert.assertEquals;

public class UnitTestICoursGroupes {

    @Test
    public void testGenerationListCours(){
        int varAttendu = 3;
        int varObtenu;

        ICoursGroupes interacteurCoursGroupes = new ICoursGroupes();
        ArrayList<Cours> listCours = interacteurCoursGroupes.generationListeCours();
        varObtenu = listCours.size();

        assertEquals(varAttendu, varObtenu);
    }

    @Test
    public void testGenerationListCoursAvecGroupe2(){
        int varAttendu = 2;
        int varObtenu;

        ICoursGroupes interacteurCoursGroupes = new ICoursGroupes();
        ArrayList<Cours> listCours = interacteurCoursGroupes.generationListeCours();
        Cours coursTest = listCours.get(0);

        varObtenu = coursTest.getGroupes().size();

        assertEquals(varAttendu, varObtenu);
    }

    @Test
    public void testGenerationListCoursAvecGroupe(){
        int varAttendu = 1;
        int varObtenu;

        ICoursGroupes interacteurCoursGroupes = new ICoursGroupes();
        ArrayList<Cours> listCours = interacteurCoursGroupes.generationListeCours();
        Cours coursTest = listCours.get(1);

        varObtenu = coursTest.getGroupes().size();

        assertEquals(varAttendu, varObtenu);
    }

    @Test
    public void testGenerationListCoursAvecGroupeAvecSeance(){
        int varAttendu = 3;
        int varObtenu;

        ICoursGroupes interacteurCoursGroupes = new ICoursGroupes();
        ArrayList<Cours> listCours = interacteurCoursGroupes.generationListeCours();
        Cours coursTest = listCours.get(0);
        Groupe groupeTest = coursTest.getGroupes().get(0);
        ArrayList<Seance> sceances = groupeTest.getSeances();

        varObtenu = sceances.size();

        assertEquals(varAttendu, varObtenu);
    }

    @Test
    public void testGenerationListCoursAvecGroupeAvecSeance2(){
        int varAttendu = 2;
        int varObtenu;

        ICoursGroupes interacteurCoursGroupes = new ICoursGroupes();
        ArrayList<Cours> listCours = interacteurCoursGroupes.generationListeCours();
        Cours coursTest = listCours.get(0);
        Groupe groupeTest = coursTest.getGroupes().get(1);
        ArrayList<Seance> sceances = groupeTest.getSeances();

        varObtenu = sceances.size();

        assertEquals(varAttendu, varObtenu);
    }

    @Test
    public void testGenerationListCoursAvecGroupeAvecSeance3(){
        int varAttendu = 1;
        int varObtenu;

        ICoursGroupes interacteurCoursGroupes = new ICoursGroupes();
        ArrayList<Cours> listCours = interacteurCoursGroupes.generationListeCours();
        Cours coursTest = listCours.get(1);
        Groupe groupeTest = coursTest.getGroupes().get(0);
        ArrayList<Seance> sceances = groupeTest.getSeances();

        varObtenu = sceances.size();

        assertEquals(varAttendu, varObtenu);
    }
}
