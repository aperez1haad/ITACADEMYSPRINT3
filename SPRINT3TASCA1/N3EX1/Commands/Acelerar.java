package INTELIJ.SPRINT3TASCA1.N3EX1.Commands;
import INTELIJ.SPRINT3TASCA1.N3EX1.Vehicles.*;

public class Acelerar implements Command {
    private Vehicle vehicle;
    public Acelerar(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
        vehicle.acelerar();
    }
}
