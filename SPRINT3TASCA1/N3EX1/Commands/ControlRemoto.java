package INTELIJ.SPRINT3TASCA1.N3EX1.Commands;

import INTELIJ.SPRINT3TASCA1.N3EX1.Commands.Command;

public class ControlRemoto {
    private Command Arrancar;
    private Command Acelerar;
    private Command Frenar;

    public void setArrancar(Command command) {
        Arrancar = command;
    }
    public void setAcelerar(Command command) {
        Acelerar = command;
    }
    public void setFrenar(Command command) {
        Frenar = command;
    }
    public void arrancarVehicle() {
        Arrancar.execute();
    }
    public void acelerarVehicle() {
        Acelerar.execute();
    }
    public void frenarVehicle() {
        Frenar.execute();
    }
}
