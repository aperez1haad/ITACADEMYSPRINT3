package INTELIJ.SPRINT3TASCA1.N2EX1;
import java.util.ArrayList;

import INTELIJ.SPRINT3TASCA1.N2EX1.FABRICAS.FabricaProducer;
import INTELIJ.SPRINT3TASCA1.N2EX1.INTERFACES.*;
import INTELIJ.SPRINT3TASCA1.N2EX1.PRODUCTOS.*;

public class App {
    public static void main(String[] args) {

        ArrayList <Address> address = new ArrayList<>();
        ArrayList <NumTelf> numTelfArrayList = new ArrayList<>();


        AbstractFactory addressFactory = FabricaProducer.getFactory("Address");

        Address addressEspaña = addressFactory.getAddress("España");
        Address addressInglaterra = addressFactory.getAddress("Inglaterra");
        Address addressItalia = addressFactory.getAddress("Italia");
        Address addressAlemania = addressFactory.getAddress("Alemania");

        addressEspaña.setAddress("Barcelona", "Gipuzcoa", 8020);
        addressInglaterra.setAddress("Londres", "Oxford Street", 98751);
        addressItalia.setAddress ("Roma", "Rua Angelio Caprio", 48751);
        addressAlemania.setAddress ("Berlin", "Swargth", 54002);

        address.add(addressEspaña);
        address.add(addressInglaterra);
        address.add(addressItalia);
        address.add(addressAlemania);

        address.stream().forEach(ad -> System.out.println(ad.getAddress()));

        AbstractFactory NumTelfFactory = FabricaProducer.getFactory("NumTelf");

        NumTelf NumTelfEspaña = NumTelfFactory.getNumTelf("España");
        NumTelf NumTelfItalia = NumTelfFactory.getNumTelf("Inglaterra");
        NumTelf NumTelfInglaterra = NumTelfFactory.getNumTelf("Italia");
        NumTelf NumTelfAlemania = NumTelfFactory.getNumTelf("Alemania");

        NumTelfEspaña.setNumTelf("657847467");
        NumTelfItalia.setNumTelf("89049484");
        NumTelfInglaterra.setNumTelf("647474733");
        NumTelfAlemania.setNumTelf("050390025");

        numTelfArrayList.add(NumTelfEspaña);
        numTelfArrayList.add(NumTelfInglaterra);
        numTelfArrayList.add(NumTelfItalia);
        numTelfArrayList.add(NumTelfAlemania);

        numTelfArrayList.stream().forEach(nt -> System.out.println(nt.getNumTelf()));

    }}

