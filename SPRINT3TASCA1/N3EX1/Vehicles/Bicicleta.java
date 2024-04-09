package INTELIJ.SPRINT3TASCA1.N3EX1.Vehicles;

public class Bicicleta extends Vehicle {
    @Override
    public void arrancar() {
        System.out.println("Arrancando bicicleta...");
    }
    @Override
    public void acelerar() {
        System.out.println("Acelerando bicicleta...");
    }
    @Override
    public void frenar() {
        System.out.println("Frenando bicicleta...");
    }
}
