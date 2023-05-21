package com.example.mygame;

public class Elmas1 {
    String elmasname;
    String elmastl;
    int image;

    public Elmas1(String elmasname, String elmastl, int image) {
        this.elmasname = elmasname;
        this.elmastl = elmastl;
        this.image = image;
    }

    public Elmas1(String elmasname, String[] elmastl) {
    }


    public String getElmasname() {
        return elmasname;
    }

    public String getElmastl() {
        return elmastl;
    }

    public int getImage() {
        return image;
    }
}
