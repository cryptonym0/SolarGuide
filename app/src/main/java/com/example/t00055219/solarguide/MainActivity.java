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

    //Initialize things
    String planetInfo = "planetInfo";
    TextView tv;
    private DialogFragment.OnFragmentInteractionListener mListener;

    //try this
    private TextView pInfo;
    int req_code_1 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        planetInfo =nRestoreInstanceState().getString(planetInfo);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("On Create", "");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("On Pause", "");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("On Resume", "");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("On Destroy", "");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("On Restart", "");
    }


    @Override
    public void onFragmentInteraction(String data) {
        FragmentManager FragManager = getSupportFragmentManager();
        DialogFragment fragmentB = (DialogFragment) FragManager.findFragmentById(R.id.fragment2);
        fragmentB.updateText(data);
    }

    @Override
    public void onSaveInstanceState(Bundle myBundle) {
// Save the user's current game state
        myBundle.putString(planetInfo, "Egg");
// Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(myBundle);
    }

    public void onRestoreInstanceState(Bundle myBundle) {
// Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(myBundle);
// Restore state members from saved instance
        myBundle.putString(planetInfo, "Egg");
    }


}
