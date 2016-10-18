package com.example.t00055219.solarguide;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
import android.net.Uri;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;

import static android.R.attr.id;
import static android.R.attr.key;
import static android.R.attr.value;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.PREPEND;


/**
 * Created by t00055219 on 10/13/2016.
 */

public class Planets extends ListFragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    String[] planetArray;
    View previous;

    private OnFragmentInteractionListener mListener;

    public Planets() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Planets.
     */
    // TODO: Rename and change types and number of parameters
    public static Planets newInstance(String param1, String param2) {
        Planets fragment = new Planets();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle myBundle) {
        super.onCreate(myBundle);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle myBundle) {
        // Inflate the layout for this fragment
        View planetview = inflater.inflate(R.layout.list_fragment, container, false);
        List<Planet> planetList = new ArrayList<>();
        planetArray = getResources().getStringArray(R.array.planet_list);

        for(int i = 0;i<planetArray.length;i++){
            planetList.add(new Planet(planetArray[i],i+1));
        }

        Adapter a = new Adapter(getContext(),R.layout.row_description,planetList);
        ListView listView = (ListView) planetview.findViewById(R.id.Listview);
        listView.setAdapter(a);
        return planetview;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            //throw new RuntimeException(context.toString()
            //      + " must implement OnFragmentInteractionListener");
        }
    }


    @Override
    public void onListItemClick(ListView l, View v, int i, long id) {
        super.onListItemClick(l, v, i, id);
        mListener.onFragmentInteraction(planetArray[i]);
//        previous.setSelected(false);
        v.setSelected(true);
        previous=v;
    }

//    private int stateToSave;
//
//    int pvalue;
//    String pkey = "";
//
////    @Override
//    public Parcelable onSaveInstanceState(){
//
//        Bundle myBundle = new Bundle();
//        myBundle.putParcelable("SuperState", super.onSaveInstanceState());
//        myBundle.putInt(pkey, pvalue);
//        return myBundle;
////        super.onSaveInstanceState(myBundle);
////        getFragmentManager().putFragment(myBundle, pkey, Planets);
//    }
//
//    @Override
//    public void onRestoreInstanceState(Parcelable state){
//        if(state instanceof Bundle)
//        {
//            Bundle myBundle = (Bundle) state;
//            this.pvalue = myBundle.getInt(pkey);
//            state = myBundle.getParcelable("SuperState");
//        }
//        super.onRestoreInstanceState(state);
//    }
//


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
}