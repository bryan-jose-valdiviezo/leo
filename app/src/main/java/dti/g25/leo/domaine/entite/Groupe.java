package dti.g25.leo.domaine.entite;

import java.util.ArrayList;
/**
 Contient les methodes et les Attributs pour un Groupe
 @author Bryan Valdiviezo
 @since 28/04/2020
 */

public class Groupe {
    private int _no;
    private ArrayList<Horaire> _horaires;
    private ArrayList<Seance> _seances;
    private ArrayList<Utilisateur> _membres;

    /**
     Initialise un Groupe avec un numéro, une liste d'horaire, une liste de séance et une liste de membres.
     @param no : int
     @param horaires : ArrayList<Horaire>
     @param seances : ArrayList<Seance>
     @param membres : ArrayList<Utilisateur>
     */
    public Groupe (int no, ArrayList<Horaire> horaires, ArrayList<Seance> seances, ArrayList<Utilisateur> membres) {
        this._no = no;
        this._horaires = horaires;
        this._seances = seances;
        this._membres = membres;
    }

    //==================================== Accesseurs ===============================================

    /**
     Retourne le numéro de groupe.
     @return _no : int
     */
    public int getNo() {
        return _no;
    }

    /**
     Retourne la liste d'horaires
     @return _horaires : ArrayList<Horaire>
     */
    public ArrayList<Horaire> getHoraires() {
        return _horaires;
    }

    /**
     Retourne la liste de séances
     @return _seances : ArrayList<Seance>
     */
    public ArrayList<Seance> getSeances() {
        return _seances;
    }

    /**
     Retourne la liste de membres
     @return _membres : ArrayList<Utilisateur>
     */
    public ArrayList<Utilisateur> getMembres() {
        return _membres;
    }

    //==================================== Mutateurs ===============================================

    /**
     Change le numéro de groupe pour celui donné en paramètre.
     @param no : int
     */
    public void setNo(int no) {
        this._no = no;
    }

    /**
     Change la liste d'horaires pour celui donné en paramètre.
     @param horaires : ArrayList<Horaire>
     */
    public void setHoraires(ArrayList<Horaire> horaires) {
        this._horaires = horaires;
    }

    /**
     Change la liste de séances pour celui donné en paramètre.
     @param seances : ArrayList<Seance>
     */
    public void setSeances(ArrayList<Seance> seances) {
        this._seances = seances;
    }

    /**
     Change la liste de membres pour celui donné en paramètre.
     @param membres : ArrayList<Utilisateur>
     */
    public void setMembres(ArrayList<Utilisateur> membres) {
        this._membres = membres;
    }
}
