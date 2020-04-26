package dti.g25.leo;

import org.junit.Test;

import dti.g25.leo.domaine.entite.EtatSeance;
import dti.g25.leo.presentation.modele.mockData.MockDataSeance;


import static org.junit.Assert.assertEquals;

public class UnitTestMockDataSeance {

    @Test
    public void testGetSeances(){
        int varAttendu = 7;
        int varObtenu;

        varObtenu = MockDataSeance.getSeances().size();

        assertEquals(varAttendu, varObtenu);
    }

    @Test
    public void testGetSeances2(){
        EtatSeance varAttendu = EtatSeance.ANNULEE;
        EtatSeance varObtenu;

        varObtenu = MockDataSeance.getSeances().get(6).getEtat();

        assertEquals(varAttendu, varObtenu);
    }

}
