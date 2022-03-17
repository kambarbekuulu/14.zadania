package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Class {
    private int  nomer;
    private String soz;
    private int[] massiv;

    public Class(int nomer, String soz, int[] massiv) {
        this.nomer = nomer;
        this.soz = soz;
        this.massiv = massiv;
    }

    public Class() {

    }



    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String getSoz() {
        return soz;
    }

    public void setSoz(String soz) {
        this.soz = soz;
    }

    public int[] getMassiv() {
        return  massiv;
    }

    public void setMassiv(int[] massiv) {
        this.massiv = massiv;
    }

    @Override
    public String toString() {
        return "Class{" +
                "nomer=" + nomer +
                ", soz='" + soz + '\'' +
                ", massiv=" + Arrays.toString(massiv) +
                '}';
    }
}




