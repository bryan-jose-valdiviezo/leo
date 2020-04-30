package dti.g25.leo.domaine.entite;

import java.util.ArrayList;

/**
 Contient les methodes et les Attributs pour un Cours
 @author Bryan Valdiviezo
 @since 28/04/2020
 */

public class Cours {
    private String _sigle;
    private String _titre;
    private String _description;
    private ArrayList<Groupe> _groupes;

    /**
     Initialise un Cours avec un sigle, un titre, une description est une liste de groupes.
     @param sigle : String
     @param titre : String
     @param description : String
     @param groupes : ArrayList<Groupe>
     */
    public Cours (String sigle, String titre, String description, ArrayList<Groupe> groupes) {
        this._sigle = sigle;
        this._titre = titre;
        this._description = description;
        this._groupes = groupes;
    }

    //==================================== Accesseurs ===============================================

    /**
     Retourne le sigle du cours.
     @return _sigle : String
     */
    public String getSigle() {
        return _sigle;
    }

    /**
     Retourne le titre du cours.
     @return _titre : String
     */
    public String getTitre() {
        return _titre;
    }

    /**
     Retourne la description du cours
     @return _description : String
     */
    public String getDescription() {
        return _description;
    }

    /**
     Retourne la liste de groupe.
     @return _groupes : ArrayList<Groupe>
     */
    public ArrayList<Groupe> getGroupes() {
        return _groupes;
    }

    //==================================== Mutateurs ===============================================

    /**
     Change le sigle du Courspour celui donné en paramètre
     @param sigle : String
     */
    public void setSigle(String sigle) {
        this._sigle = sigle;
    }

    /**
     Change le titre du Cours pour celui donné en paramètre.
     @param titre : String
     */
    public void setTitre(String titre) {
        this._titre = titre;
    }

    /**
     Change la description du Cours pour celui donné en paramètre.
     @param description : String
     */
    public void setDescription(String description) {
        this._description = description;
    }

    /**
     Change la liste de groupe du Cours pour celui donné en paramètre.
     @param groupes : ArrayList<Groupe>
     */
    public void setGroupes(ArrayList<Groupe> groupes) {
        this._groupes = groupes;
    }
}
