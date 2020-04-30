package dti.g25.leo.presentation.presenteur;

import android.app.Activity;
import android.content.Intent;
import dti.g25.leo.ui.activite.ActiviteChoixUtilisateurs;


/**
 * Présenteur de base qui contient des fonctions partagées par toutes les présenteurs
 * @author Simon Roy
 * @since 06/03/2020
 */
public abstract class PresenteurBase {
    private Activity _activite;

    public PresenteurBase(Activity activite) {
        _activite = activite;
    }

    public void retourActivitePrincipale() {
        Intent intent = new Intent(_activite.getApplicationContext(), ActiviteChoixUtilisateurs.class);

        _activite.startActivity(intent);
        _activite.finish();
    }
}
