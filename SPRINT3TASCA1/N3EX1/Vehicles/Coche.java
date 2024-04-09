package INTELIJ.SPRINT3TASCA1.N3EX1.Vehicles;

public class Coche extends Vehicle {
    @Override
    public void arrancar() {
        System.out.println("Arrancando coche...");
    }
    @Override
    public void acelerar() {
        System.out.println("Acelerando coche...");
    }
    @Override
    public void frenar() {
        System.out.println("Frenando coche...");
    }
}
