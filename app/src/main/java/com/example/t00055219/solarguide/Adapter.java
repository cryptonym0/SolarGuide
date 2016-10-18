package com.example.t00055219.solarguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by t00055219 on 10/13/2016.
 */

public class Adapter extends ArrayAdapter<Planet> {

    public Adapter(Context context, int resource, List<Planet> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        if (v == null){
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.row_description, null);
        }

        Planet planet = getItem(position);

        if (planet != null) {
            TextView planets = (TextView) v.findViewById(R.id.planets);
            TextView number = (TextView) v.findViewById(R.id.number);


            if (planets != null){
                planets.setText(planet.getName());
            }

            if (number != null){
                number.setText(Integer.toString(planet.getID()));
            }
        }
        return v;
    }
}