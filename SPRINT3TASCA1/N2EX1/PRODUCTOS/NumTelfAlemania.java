package INTELIJ.SPRINT3TASCA1.N2EX1.PRODUCTOS;

import INTELIJ.SPRINT3TASCA1.N2EX1.INTERFACES.NumTelf;

public class NumTelfAlemania implements NumTelf {

    private String numTelf;
    private String prefijo;
    public NumTelfAlemania(){
    }
    public void setNumTelf (String numTelf){
        this.prefijo = "+49";
        this.numTelf = numTelf;
    }
    public String getNumTelf(){
        return prefijo+ " - "+numTelf;
    }
}
