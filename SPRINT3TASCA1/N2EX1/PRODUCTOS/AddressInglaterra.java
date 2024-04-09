package INTELIJ.SPRINT3TASCA1.N2EX1.PRODUCTOS;

import INTELIJ.SPRINT3TASCA1.N2EX1.INTERFACES.Address;

public class AddressInglaterra implements Address {

    private String country;
    private String city;
    private String street;
    private int codigoPostal;

    public AddressInglaterra(){
    }
    public void setAddress (String city, String street, int codigoPostal){
        this.country = "Inglaterra";
        this.city=city;
        this.street = street;
        this.codigoPostal =  codigoPostal;
    }
    public String getAddress(){
        return country+", "+city+", "+street+", "+codigoPostal;
    }
}
