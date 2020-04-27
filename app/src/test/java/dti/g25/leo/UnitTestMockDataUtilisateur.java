package dti.g25.leo;

import org.junit.Test;

import dti.g25.leo.domaine.entite.Utilisateur;
import dti.g25.leo.presentation.modele.mockData.MockDataUtilisateur;

import static org.junit.Assert.*;

public class UnitTestMockDataUtilisateur {

    @Test
    public void testGetUtilisateurs(){
        int varAttendu = 4;
        int varObtenu;

        varObtenu = MockDataUtilisateur.getUtilisateurs().size();

        assertEquals(varAttendu, varObtenu);
    }

    @Test
    public void testGetUnUtilisateurParNom(){
        String varAttendu = "Daudet";
        String varObtenu;

        Utilisateur utilisateurTest = MockDataUtilisateur.getUtilisateurParNom("Daudet");
        varObtenu = utilisateurTest.getNom();

        assertEquals(varAttendu, varObtenu);
    }

    @Test
    public void testGetUnUtilisateurParNomAbsent(){
        Utilisateur varObtenu;

        varObtenu = MockDataUtilisateur.getUtilisateurParNom("Macron");

        assertNull(varObtenu);
    }


}
