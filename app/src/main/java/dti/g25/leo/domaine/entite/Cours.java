package dti.g25.leo.domaine.entite;

import java.util.ArrayList;

public class Cours {
    private String sigle;
    private String titre;
    private String description;
    private ArrayList<Groupe> groupes;

    public Cours (String sigle, String titre, String description, ArrayList<Groupe> groupes) {
        this.sigle = sigle;
        this.titre = titre;
        this.description = description;
        this.groupes = groupes;
    }

    //==================================== GETTERS ===============================================

    public String getSigle() {
        return sigle;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Groupe> getGroupes() {
        return groupes;
    }

    //==================================== SETTERS ===============================================

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setGroupes(ArrayList<Groupe> groupes) {
        this.groupes = groupes;
    }
}
