package com.example.t00055219.solarguide;

import android.app.Activity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import static android.R.attr.data;
import static com.example.t00055219.solarguide.R.id.planets;

public class MainActivity extends AppCompatActivity implements Planets.OnFragmentInteractionListener, DialogFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("On Create", "On Create");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("On Pause", "On Pause");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("On Resume", "On Resume");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("On Destroy", "On Destroy");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("On Restart", "On Restart");
    }

    @Override
    public void onFragmentInteraction(String data) {
        FragmentManager FragManager = getSupportFragmentManager();
        DialogFragment fragmentB = (DialogFragment) FragManager.findFragmentById(R.id.fragment2);
        fragmentB.updateText(data);
        Log.d("Fragment Interaction", "Fragments Should Interact");
    }




}
