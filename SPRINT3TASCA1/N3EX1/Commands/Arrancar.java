package INTELIJ.SPRINT3TASCA1.N3EX1.Commands;
import INTELIJ.SPRINT3TASCA1.N3EX1.Vehicles.*;

public class Arrancar implements Command{
    private Vehicle vehicle;
    public Arrancar(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
        vehicle.arrancar();
    }
}

