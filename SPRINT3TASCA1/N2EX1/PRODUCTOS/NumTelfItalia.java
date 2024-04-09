package INTELIJ.SPRINT3TASCA1.N2EX1.PRODUCTOS;

import INTELIJ.SPRINT3TASCA1.N2EX1.INTERFACES.NumTelf;

public class NumTelfItalia implements NumTelf {

    private String numTelf;
    private String prefijo;
    public NumTelfItalia(){
    }
    public void setNumTelf (String numTelf){
        this.prefijo = "+39";
        this.numTelf = numTelf;
    }
    public String getNumTelf(){
        return prefijo+ " - "+numTelf;
    }
}