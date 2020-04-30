package dti.g25.leo.presentation.vue;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import java.util.Calendar;

/**
 * Permet de choisir une date
 * @author Simon Roy
 * @since 30/04/2020
 */
public class DatePicker extends DialogFragment {

    /**
     * Ouvre une fenêtre contextuel permetant de choisir et retourner une date
     * @param savedInstanceState
     * @return Dialog
     */
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar c = Calendar.getInstance();
        int annee = c.get(Calendar.YEAR);
        int mois = c.get(Calendar.MONTH);
        int jour = c.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(getContext(), AlertDialog.THEME_DEVICE_DEFAULT_DARK, (DatePickerDialog.OnDateSetListener) getActivity(), annee, mois, jour);
    }
}
