package dti.g25.leo.domaine.entite;

/**
 Contient les methodes et les Attributs pour un Utilisateur
 @author Philippe
 @since 23/04/2020
 @version 1
 */

public class  Utilisateur {

    protected int id;
    protected String prenom;
    protected String nom;
    protected Role role;

    /**
     Initialise un utilisateur avec son id, son prénom, son nom et son rôle
     @param unId : int
     @param unPrenom : String
     @param unNom : String
     @param unRole : String
     */

    public Utilisateur(int unId, String unPrenom, String unNom, Role unRole){
        assert unNom != null && unNom != "" : "Le nom de l'utilisateur ne peut être nulle ou vide";

        id = unId;
        prenom = unPrenom;
        nom = unNom;
        role = unRole;
    }

    /**
     Constructeur minimal d'un utilisateur
     @param unId : int
     */
    public Utilisateur(int unId) {

        id = unId;
    }

    /**
     Retourne l'id de l'utilisateur
     @return id : int
     */

    public int getId(){ return id; }

    /**
     Retourne le prenom de l'utilisateur
     @return prenom : int
     */

    public String getPrenom(){ return prenom; }

    /**
     Retourne le nom de l'utilisateur
     @return nom : String
     */

    public String getNom(){ return nom; }

    /**
     Retourne le rôle de l'utilisateur
     @return role : String
     */

    public Role getRole(){ return role; }

    /**
     Émet un prenom à l'utilisateur
     @param nouveauPrenom : String
     */

    public void setPrenom(String nouveauPrenom){ prenom=nouveauPrenom; }

    /**
     Émet un nom de l'utilisateur
     @param nouveauNom : String
     */

    public void setNom(String nouveauNom){ nom=nouveauNom; }

    /**
     Émet un rôle de l'utilisateur
     @param nouveauRole : String
     */

    public void setRole(Role nouveauRole){ role=nouveauRole; }


}
