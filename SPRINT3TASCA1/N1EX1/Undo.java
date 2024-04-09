package INTELIJ.SPRINT3TASCA1.N1EX1;

import java.util.ArrayList;

public class Undo {
    private static Undo instancia;
    private static ArrayList<String> tareas;
    private Undo() {
        tareas = new ArrayList<>();
    }
    public static Undo getInstance() {
        if(instancia==null) {
            instancia = new Undo();
        }
        return instancia;
    }
    public void guardarRequest(String request) {
        tareas.add(request);
    }
    public void eliminarUltimaRequest() {
        if (!tareas.isEmpty()) {
            tareas.remove(tareas.size()-1);
        } else {
            System.out.println("La llista de comandes esta buida");
        }
    }
    public void listaRequests() {
        tareas.stream().forEach(System.out::println);
    }
}