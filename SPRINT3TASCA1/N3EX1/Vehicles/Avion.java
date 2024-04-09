package INTELIJ.SPRINT3TASCA1.N3EX1.Vehicles;

public class Avion extends Vehicle {
    @Override
    public void arrancar() {
        System.out.println("Arrancando avión...");
    }
    @Override
    public void acelerar() {
        System.out.println("Acelerando avión...");
    }
    @Override
    public void frenar() {
        System.out.println("Frenando avión...");
    }
}
