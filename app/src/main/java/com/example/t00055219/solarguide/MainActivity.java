package com.example.t00055219.solarguide;

import android.app.Activity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static android.R.attr.data;
import static com.example.t00055219.solarguide.R.id.planets;

public class MainActivity extends AppCompatActivity implements Planets.OnFragmentInteractionListener, DialogFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onFragmentInteraction(String data) {
        FragmentManager FragManager = getSupportFragmentManager();
        DialogFragment fragmentB = (DialogFragment) FragManager.findFragmentById(R.id.fragment2);
        fragmentB.updateText(data);
    }
}
