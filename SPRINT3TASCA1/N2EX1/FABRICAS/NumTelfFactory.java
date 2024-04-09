package INTELIJ.SPRINT3TASCA1.N2EX1.FABRICAS;

import INTELIJ.SPRINT3TASCA1.N2EX1.INTERFACES.*;
import INTELIJ.SPRINT3TASCA1.N2EX1.PRODUCTOS.*;

public class NumTelfFactory implements AbstractFactory {

    @Override
    public NumTelf getNumTelf(String country) {
        if(country.equalsIgnoreCase("España")){
            return new NumTelfEspaña();
        }
        else if (country.equalsIgnoreCase("Inglaterra")){
            return new NumTelfInglaterra();
        }
        else if (country.equalsIgnoreCase("Italia")) {
            return new NumTelfItalia();
        }
        else if (country.equalsIgnoreCase("Alemania")) {
            return new NumTelfAlemania();
        }
        return null;
    }
    public Address getAddress (String country){
        return null;
    }
}
