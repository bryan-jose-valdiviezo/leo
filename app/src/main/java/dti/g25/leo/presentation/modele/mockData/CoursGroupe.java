package dti.g25.leo.presentation.modele.mockData;

import java.util.ArrayList;

import dti.g25.leo.domaine.entite.Seance;

public class CoursGroupe {

    private String _titre;
    private String _sigle;
    private int _numero;
    private ArrayList<Seance> _seances = new ArrayList<>();

    public CoursGroupe(String titre, String sigle, int numero, ArrayList<Seance> seances) {
        _titre = titre;
        _sigle = sigle;
        _numero = numero;
        _seances = seances;
    }

    public String getTitre() {
        return _titre;
    }

    public void setTitre(String titre) {
        _titre = titre;
    }

    public String getSigle() {
        return _sigle;
    }

    public void setSigle(String sigle) {
        _sigle = sigle;
    }

    public int getNumero() {
        return _numero;
    }

    public void setNumero(int numero) {
        _numero = numero;
    }

    public ArrayList<Seance> get_seances() {
        return _seances;
    }

    public void set_seances(ArrayList<Seance> seances) {
        _seances = seances;
    }
}
