package ru.appline.logic;

public class Compass {

    public String pars;
    private String degree;

    public Compass(){
        super();
    }

    public Compass(String degree) {
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String split(String s) {
        return s;
    }
}
