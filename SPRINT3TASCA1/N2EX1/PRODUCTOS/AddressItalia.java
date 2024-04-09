package INTELIJ.SPRINT3TASCA1.N2EX1.PRODUCTOS;

import INTELIJ.SPRINT3TASCA1.N2EX1.INTERFACES.Address;

public class AddressItalia implements Address {

    private String country;
    private String city;
    private String street;
    private int codigoPostal;

    public AddressItalia(){
    }
    public void setAddress (String city, String street, int codigoPostal){
        this.country = "Italia";
        this.city=city;
        this.street = street;
        this.codigoPostal =  codigoPostal;
    }
    public String getAddress(){
        return country+", "+city+", "+street+", "+codigoPostal;
    }
}
