package dti.g25.leo.domaine.entite;

import java.sql.Time;

/**
 Contient les methodes et les Attributs pour un Horaire
 @author Bryan Valdiviezo
 @since 28/04/2020
 */


public class Horaire {
    private Time _debut;
    private Time _fin;
    private Jour _jour;

    /**
     Initialise un horaire avec un temps de début, temps de fin et un jour
     @param debut : Time
     @param fin : Time
     @param jour : Jour
     */
    public Horaire (Time debut, Time fin, Jour jour) {
        this._debut = debut;
        this._fin = fin;
        this._jour = jour;
    }

    //==================================== Accesseurs ===============================================

    /**
     Retourne le temps de début.
     @return _debut : Time
     */
    public Time getDebut() {
        return _debut;
    }

    /**
     Retourne le temps de fin.
     @return _fin : Time
     */
    public Time getFin() {
        return _fin;
    }

    /**
     Retourne le jour.
     @return _jour : Jour
     */
    public Jour getJour() {
        return _jour;
    }

    //==================================== Mutateurs ===============================================

    /**
     Modifie le temps de début pour celui donné en paramètre.
     @param debut : Time
     */
    public void setDebut(Time debut) {
        this._debut = debut;
    }

    /**
     Modifie le temps de fin pour celui donné en paramètre.
     @param fin : Time
     */
    public void setFin(Time fin) {
        this._fin = fin;
    }

    /**
     Modifie le jour pour celui donné en paramètre.
     @param jour : Jour
     */
    public void setJour(Jour jour) {
        this._jour = jour;
    }
}
