package INTELIJ.SPRINT3TASCA1.N2EX1.PRODUCTOS;

import INTELIJ.SPRINT3TASCA1.N2EX1.INTERFACES.NumTelf;

public class NumTelfEspaña implements NumTelf {

    private String numTelf;
    private String prefijo;
    public NumTelfEspaña(){
    }
    public void setNumTelf (String numTelf){
        this.prefijo = "+34";
        this.numTelf = numTelf;
    }
    public String getNumTelf(){
        return prefijo+ " - "+numTelf;
    }
}