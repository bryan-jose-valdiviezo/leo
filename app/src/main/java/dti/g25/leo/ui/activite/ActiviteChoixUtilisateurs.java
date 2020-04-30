package dti.g25.leo.ui.activite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import dti.g25.leo.R;
import dti.g25.leo.presentation.vue.VueBase;

public class ActiviteChoixUtilisateurs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_utilisateurs);

//        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//        ft.add(R.id.layout_authentification, new VueBase());
//        ft.commit();
    }
}
