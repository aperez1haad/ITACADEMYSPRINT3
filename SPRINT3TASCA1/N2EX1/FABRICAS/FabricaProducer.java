package INTELIJ.SPRINT3TASCA1.N2EX1.FABRICAS;

import INTELIJ.SPRINT3TASCA1.N2EX1.INTERFACES.AbstractFactory;

public class FabricaProducer {

    public static AbstractFactory getFactory(String factory){
        if (factory.equalsIgnoreCase("Address")){
            return new AddressFactory();
        }
        else if (factory.equalsIgnoreCase("NumTelf")){
            return new NumTelfFactory();
        }
        return null;
    }
}
