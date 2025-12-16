package com.example.calculatrice;


public class Operation {


    private String type;
    private double a;
    private double b;
    private double resultat;


    public Operation() {
    }


    public Operation(String type, double a, double b, double resultat) {
        this.type = type;
        this.a = a;
        this.b = b;
        this.resultat = resultat;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public double getA() {
        return a;
    }


    public void setA(double a) {
        this.a = a;
    }


    public double getB() {
        return b;
    }


    public void setB(double b) {
        this.b = b;
    }


    public double getResultat() {
        return resultat;
    }


    public void setResultat(double resultat) {
        this.resultat = resultat;
    }
}