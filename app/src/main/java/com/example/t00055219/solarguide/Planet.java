package com.example.t00055219.solarguide;

/**
 * Created by t00055219 on 10/13/2016.
 */

public class Planet {
    String name;
    int id;
    public Planet(String iname, int iid)
    {
        name = iname;
        id = iid;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String iname)
    {
        name = iname;
    }
    public int getID()
    {
        return id;
    }
    public void setID(int iid)
    {
        id = iid;
    }
}
