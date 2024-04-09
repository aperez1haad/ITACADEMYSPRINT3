package INTELIJ.SPRINT3TASCA1.N2EX1.FABRICAS;

import INTELIJ.SPRINT3TASCA1.N2EX1.INTERFACES.AbstractFactory;
import INTELIJ.SPRINT3TASCA1.N2EX1.INTERFACES.Address;
import INTELIJ.SPRINT3TASCA1.N2EX1.INTERFACES.NumTelf;
import INTELIJ.SPRINT3TASCA1.N2EX1.PRODUCTOS.AddressInglaterra;
import INTELIJ.SPRINT3TASCA1.N2EX1.PRODUCTOS.AddressItalia;
import INTELIJ.SPRINT3TASCA1.N2EX1.PRODUCTOS.AddressAlemania;
import INTELIJ.SPRINT3TASCA1.N2EX1.PRODUCTOS.AddressEspaña;

public class AddressFactory implements AbstractFactory {
    public Address getAddress(String country){
        if(country.equalsIgnoreCase("España")){
            return new AddressEspaña();
        }
        else if (country.equalsIgnoreCase("Inglaterra")){
            return new AddressInglaterra();
        }
        else if (country.equalsIgnoreCase("Italia")) {
            return new AddressItalia();
        }
        else if (country.equalsIgnoreCase("Alemania")) {
            return new AddressAlemania();
        }
        return null;
    }
    public NumTelf getNumTelf (String country){
        return null;
    }
}
