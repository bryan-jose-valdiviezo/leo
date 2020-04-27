package dti.g25.leo.domaine.entite;

import java.sql.Time;

public class Horaire {
    private Time debut;
    private Time fin;
    private Jour jour;

    public Horaire (Time debut, Time fin, Jour jour) {
        this.debut = debut;
        this.fin = fin;
        this.jour = jour;
    }

    //==================================== GETTERS ===============================================

    public Time getDebut() {
        return debut;
    }

    public Time getFin() {
        return fin;
    }

    public Jour getJour() {
        return jour;
    }

    //==================================== SETTERS ===============================================

    public void setDebut(Time debut) {
        this.debut = debut;
    }

    public void setFin(Time fin) {
        this.fin = fin;
    }

    public void setJour(Jour jour) {
        this.jour = jour;
    }
}
