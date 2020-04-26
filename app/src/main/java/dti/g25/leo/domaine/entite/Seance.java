package dti.g25.leo.domaine.entite;

import android.os.Build;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 Contient les methodes et les Attributs pour une scéance
 @author Philippe
 @since 23/04/2020
 @version 1
 */

public class  Seance {

    protected LocalDateTime date;
    protected ArrayList<Utilisateur> presences;
    protected EtatSeance etat;

    /**
     Initialise une séance avec sa date, ses présences et son état
     @param uneDate : LocalDateTime
     @param desPresences : ArrayList<Utilisateur>
     @param unEtat : EtatSeance
     */

    public Seance(LocalDateTime uneDate, ArrayList<Utilisateur> desPresences, EtatSeance unEtat){

        assert uneDate != null : "La Date ne peut être nulle";
        assert unEtat != null : "L'état de la séance ne peut être nulle";

        // Le "if" permet de vérifier la version de SDK pour que le temps puisse être comparé correctement
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
            assert uneDate.compareTo(LocalDateTime.now()) >= 0  : "La date du jalon ne peut pas être avant la date du moment présent";

        date = uneDate;
        presences = desPresences;
        etat = unEtat;
    }

    /**
     Constructeur minimal d'une séance
     @param uneDate : LocalDateTime
     @param unEtat : EtatSeance
     */

    public Seance(LocalDateTime uneDate, EtatSeance unEtat ) {

        date = uneDate;
        etat = unEtat;

        assert uneDate != null : "La Date ne peut être nulle";
        assert unEtat != null : "L'état de la séance ne peut être nulle";

        // Le "if" permet de vérifier la version de SDK pour que le temps puisse être comparé correctement
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
            assert uneDate.compareTo(LocalDateTime.now()) >= 0  : "La date du jalon ne peut pas être avant la date du moment présent";
    }

    /**
     Retourne la date de la séance
     @return date : LocalDateTime
     */

    public LocalDateTime getDate(){ return date; }

    /**
     Retourne l'état de la séance
     @return etat : EtatSeance
     */

    public EtatSeance getEtat(){ return etat; }

    /**
     Retourne les présences de la séance
     @return presences : ArrayList<Utilisateur>
     */

    public ArrayList<Utilisateur> getPresences(){ return presences; }

    /**
     Émet une date à la séance
     @param nouvelleDate : LocalDateTime
     */

    public void setDate(LocalDateTime nouvelleDate){ date=nouvelleDate; }

    /**
     Émet un état à la séance
     @param nouvelEtat : EtatSeance
     */

    public void setEtat(EtatSeance nouvelEtat){ etat=nouvelEtat; }

    /**
     Émet un nouvel utilisateur dans la liste de présence
     @param nouveauUtilisateur : Utilisateur
     */

    public void setUtilisateurPresence(Utilisateur nouveauUtilisateur){ presences.add(nouveauUtilisateur); }


}