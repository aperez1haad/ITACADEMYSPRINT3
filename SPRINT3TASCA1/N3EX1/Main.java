package INTELIJ.SPRINT3TASCA1.N3EX1;

import INTELIJ.SPRINT3TASCA1.N3EX1.Commands.*;
import INTELIJ.SPRINT3TASCA1.N3EX1.Vehicles.*;


public class Main {
    public static void main(String[] args) {
        // Crear vehículos
        Vehicle coche = new Coche();
        Vehicle bicicleta = new Bicicleta();
        Vehicle avion = new Avion();
        Vehicle barco = new Barco();

        // Crear comandos
        Command arrancarcoche = new Arrancar(coche);
        Command acelerarcoche = new Acelerar(coche);
        Command frenarcoche = new Frenar(coche);

        Command arrancarbicicleta = new Arrancar(bicicleta);
        Command acelerarbicicleta = new Acelerar(bicicleta);
        Command frenarbicicleta = new Frenar(bicicleta);


        // Crear control remoto
        ControlRemoto remoteControl = new ControlRemoto();

        // Asignar comandos al control remoto
        remoteControl.setArrancar(arrancarcoche);
        remoteControl.setAcelerar(acelerarcoche);
        remoteControl.setFrenar(frenarbicicleta);

        // Utilizar el control remoto
        remoteControl.arrancarVehicle();
        remoteControl.acelerarVehicle();
        remoteControl.frenarVehicle();
    }
}
