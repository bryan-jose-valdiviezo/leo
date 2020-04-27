package dti.g25.leo.presentation.modele.mockData;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import dti.g25.leo.domaine.entite.EtatSeance;
import dti.g25.leo.domaine.entite.Role;
import dti.g25.leo.domaine.entite.Seance;
import dti.g25.leo.domaine.entite.Utilisateur;

@RequiresApi(api = Build.VERSION_CODES.O)
public class MockDataSeance {
    private static final List<Seance> seances = new ArrayList<>();

    static {

        Utilisateur utilisateur1 = new Utilisateur(1, "", "Hugo", Role.ETUDIANT);
        Utilisateur utilisateur2 = new Utilisateur(2, "", "Verlaine", Role.ETUDIANT);
        Utilisateur utilisateur3 = new Utilisateur(3, "", "Daudet", Role.ETUDIANT);
        Utilisateur utilisateur4 = new Utilisateur(4, "", "Lafontaine", Role.ENSEIGNANT);

        List<Utilisateur> personnesPresentes1 = new ArrayList<>();
        List<Utilisateur> personnesPresentes2 = new ArrayList<>();
        List<Utilisateur> personnesPresentes3 = new ArrayList<>();
        List<Utilisateur> personnesPresentes4 = new ArrayList<>();
        List<Utilisateur> personnesPresentes5 = new ArrayList<>();
        List<Utilisateur> personnesPresentes6 = new ArrayList<>();

        personnesPresentes1.add(utilisateur1);
        personnesPresentes1.add(utilisateur2);
        personnesPresentes1.add(utilisateur3);

        personnesPresentes2.add(utilisateur2);
        personnesPresentes2.add(utilisateur3);
        personnesPresentes2.add(utilisateur4);

        personnesPresentes3.add(utilisateur3);
        personnesPresentes3.add(utilisateur4);

        personnesPresentes4.add(utilisateur4);
        personnesPresentes4.add(utilisateur1);

        personnesPresentes5.add(utilisateur1);
        personnesPresentes5.add(utilisateur3);
        personnesPresentes5.add(utilisateur4);

        personnesPresentes6.add(utilisateur2);
        personnesPresentes6.add(utilisateur3);
        personnesPresentes6.add(utilisateur4);

        Seance seance1 =  new Seance (LocalDateTime.of(2020, 2, 1, 8, 0), (ArrayList<Utilisateur>) personnesPresentes1, EtatSeance.TENUE);
        Seance seance2 =  new Seance (LocalDateTime.of(2020, 2, 1, 10, 0), (ArrayList<Utilisateur>) personnesPresentes2, EtatSeance.TENUE);
        Seance seance3 =  new Seance (LocalDateTime.of(2020, 2, 2, 8, 0), (ArrayList<Utilisateur>) personnesPresentes3, EtatSeance.TENUE);
        Seance seance4 =  new Seance (LocalDateTime.of(2020, 2, 2, 10, 0), (ArrayList<Utilisateur>) personnesPresentes4, EtatSeance.TENUE);
        Seance seance5 =  new Seance (LocalDateTime.of(2020, 2, 5, 10, 0), (ArrayList<Utilisateur>) personnesPresentes4, EtatSeance.TENUE);
        Seance seance6 =  new Seance (LocalDateTime.of(2020, 2, 6, 10, 0), (ArrayList<Utilisateur>) personnesPresentes5, EtatSeance.TENUE);
        Seance seance7 =  new Seance (LocalDateTime.of(2020, 2, 7, 10, 0), (ArrayList<Utilisateur>) personnesPresentes6, EtatSeance.ANNULEE);

        seances.add(seance1);
        seances.add(seance2);
        seances.add(seance3);
        seances.add(seance4);
        seances.add(seance5);
        seances.add(seance6);
        seances.add(seance7);
    }

    public static ArrayList<Seance> getSeances(){
        return (ArrayList<Seance>) seances;
    }

    public static Seance getSeanceParDate(LocalDateTime dateTime){
        for (Seance uneSeance: seances) {
            if(uneSeance.getDate() == dateTime)
                return uneSeance;
        }
        return null;
    }

}