package INTELIJ.SPRINT3TASCA1.N2EX1.PRODUCTOS;

import INTELIJ.SPRINT3TASCA1.N2EX1.INTERFACES.NumTelf;

public class NumTelfInglaterra implements NumTelf {

    private String numTelf;
    private String prefijo;
    public NumTelfInglaterra(){
    }
    public void setNumTelf (String numTelf){
        this.prefijo = "+44";
        this.numTelf = numTelf;
    }
    public String getNumTelf(){
        return prefijo+ " - "+numTelf;
    }
}