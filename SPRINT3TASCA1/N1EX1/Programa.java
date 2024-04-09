package INTELIJ.SPRINT3TASCA1.N1EX1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
    public static void programa(){
        Undo undo = Undo.getInstance();
        Boolean opcion = true;
        while (opcion) {
            opcion=menu(imprimirMenu(), undo, opcion);
        }
    }
    public static int imprimirMenu() {
        int resposta = 0;
        boolean acceptedInput = false;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("¿Qué quieres hacer?");
            System.out.println("1. Introducir una tarea");
            System.out.println("2. Leer tareas");
            System.out.println("3. Deshacer tarea");
            System.out.println("4. Salir");
            try {
                resposta = sc.nextInt();
                acceptedInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format");
                sc.nextLine();
            }
        } while (!acceptedInput);
        return resposta;
    }
    public static boolean menu(int resposta, Undo undo, Boolean opcion) {
        switch (resposta) {
            case 1:
                undo.guardarRequest(doingRequest("Introdueix una tasca a realitzar"));
                break;
            case 2:
                undo.listaRequests();
                break;
            case 3:
                undo.eliminarUltimaRequest();
                undo.listaRequests();
                break;
            case 4:
                System.out.println("Fins aviat!");
                opcion=false;
            default:
                System.out.println("No has seleccionat una opcio disponible");
                break;
        }
        return opcion;
    }
    public static String doingRequest(String message) {
        Scanner sc = new Scanner(System.in);
        String request = "";
        boolean acceptedInput = false;
        do {
            System.out.println(message);
            try {
                request = sc.nextLine();
                acceptedInput = true;
            } catch (Exception e) {
                System.out.println("Error");
                sc.nextLine();
            }
        } while (!acceptedInput);
        return request;
    }

}