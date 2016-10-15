package com.example.t00055219.solarguide;

import android.app.Fragment;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by t00055219 on 10/13/2016.
 */


public class DialogFragment extends android.support.v4.app.Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PLANET_INFO = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private TextView tv;
    private String currentInfo;
    int request_code_1 = 1;

    private OnFragmentInteractionListener mListener;

    public DialogFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DialogFragment
     */
    // TODO: Rename and change types and number of parameters
    public static DialogFragment newInstance(String param1, String param2) {
        DialogFragment fragment = new DialogFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PLANET_INFO, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle myBundle) {
        super.onCreate(myBundle);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle myBundle) {
        super.onCreate(myBundle);
        // Inflate the layout for this fragment
        View planetd = inflater.inflate(R.layout.info_fragment, container, false);
        tv = (TextView) planetd.findViewById(R.id.dialogFragment);


        if (myBundle != null) {
            temp = myBundle.getString(test);
            updateText(temp);

        }

        //Find layouts

        return planetd;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    public void updateText(String data) {
        temp = data;
        if (data.equals(null)) {
            tv.setText("Data Is Null");
        } else {
            Resources res = getResources();
            String[] planets = res.getStringArray(R.array.descriptions);
            switch (data) {

                case "Sun":
                    tv.setText(planets[0]);
                    break;
                case "Mercury":
                    tv.setText(planets[1]);
                    break;
                case "Venus":
                    tv.setText(planets[2]);
                    break;
                case "Earth":
                    tv.setText(planets[3]);
                    break;
                case "Mars":
                    tv.setText(planets[4]);
                    break;
                case "Jupiter":
                    tv.setText(planets[5]);
                    break;
                case "Saturn":
                    tv.setText(planets[6]);
                    break;
                case "Uranus":
                    tv.setText(planets[7]);
                    break;
                case "Neptune":
                    tv.setText(planets[8]);
                    break;
                case "Pluto":
                    tv.setText(planets[9]);
                    break;
            }
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(String uri);
    }

    String temp;
    String test = "Egg";
    @Override
    public void onSaveInstanceState(Bundle myBundle) {
        myBundle.putString(test, temp);
        super.onSaveInstanceState(myBundle);
    }
}
