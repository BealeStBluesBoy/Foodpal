package com.grupotres.foodpal.activities;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.annotation.NonNull;
import android.view.MenuItem;

import com.grupotres.foodpal.R;
import com.grupotres.foodpal.fragments.ListaFragment;
import com.grupotres.foodpal.fragments.MasFragment;
import com.grupotres.foodpal.fragments.PiramideFragment;

public class MainActivity extends AppCompatActivity {
    private Fragment listaFragment = new ListaFragment();
    private Fragment piramideFragment = new PiramideFragment();
    private Fragment masFragment = new MasFragment();

    private FragmentManager manager = getSupportFragmentManager();

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            hideFragments();
            switch (item.getItemId()) {
                case R.id.navigation_lista:
                    showFragment(listaFragment);
                    return true;
                case R.id.navigation_piramide:
                    showFragment(piramideFragment);
                    return true;
                case R.id.navigation_mas:
                    showFragment(masFragment);
                    return true;
                default:
                    return false;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        manager.beginTransaction()
                .add(R.id.fragment_container, listaFragment)
                .add(R.id.fragment_container, piramideFragment).hide(piramideFragment)
                .add(R.id.fragment_container, masFragment).hide(masFragment)
                .commit();

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private void showFragment(Fragment fragment) {
        manager.beginTransaction()
            .show(fragment).commit();
    }

    private void hideFragments() {
        manager.beginTransaction()
            .hide(listaFragment)
            .hide(piramideFragment)
            .hide(masFragment)
            .commit();
    }

}
