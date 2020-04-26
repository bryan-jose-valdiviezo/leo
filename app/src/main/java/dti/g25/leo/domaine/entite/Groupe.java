package dti.g25.leo.domaine.entite;

import java.util.ArrayList;

public class Groupe {
    private int no;
    private ArrayList<Horaire> horaires;
    private ArrayList<Seance> seances;
    private ArrayList<Utilisateur> membres;

    public Groupe (int no, ArrayList<Horaire> horaires, ArrayList<Seance> seances, ArrayList<Utilisateur> membres) {
        this.no = no;
        this.horaires = horaires;
        this.seances = seances;
        this.membres = membres;
    }

    //==================================== GETTERS ===============================================

    public int getNo() {
        return no;
    }

    public ArrayList<Horaire> getHoraires() {
        return horaires;
    }

    public ArrayList<Seance> getSeances() {
        return seances;
    }

    public ArrayList<Utilisateur> getMembres() {
        return membres;
    }

    //==================================== SETTERS ===============================================

    public void setNo(int no) {
        this.no = no;
    }

    public void setHoraires(ArrayList<Horaire> horaires) {
        this.horaires = horaires;
    }

    public void setSeances(ArrayList<Seance> seances) {
        this.seances = seances;
    }

    public void setMembres(ArrayList<Utilisateur> membres) {
        this.membres = membres;
    }

    public void addSeances (Seance uneSeance){
        this.seances.add(uneSeance);
    }

}
