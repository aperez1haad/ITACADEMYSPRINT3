package INTELIJ.SPRINT3TASCA1.N3EX1.Vehicles;

public class Barco extends Vehicle {
    @Override
    public void arrancar() {
        System.out.println("Arrancando barco...");
    }
    @Override
    public void acelerar() {
        System.out.println("Acelerando barco...");
    }
    @Override
    public void frenar() {
        System.out.println("Frenando barco...");
    }
}
