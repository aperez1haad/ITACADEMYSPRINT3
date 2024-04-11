package INTELIJ.SPRINT3TASCA2.N1EX2;
import java.util.ArrayList;

public class AgenteSubjectObservable {
    private ArrayList<Observers> listaAgenciasObservadoras = new ArrayList<>();
    private String accion;
    private double precio;

    // Método para registrar/eliminar observadores
    public void registrarObservador(Observers agenciaX) {
        listaAgenciasObservadoras.add(agenciaX);
    }
    public void eliminarObservador(Observers agenciaX) {
        listaAgenciasObservadoras.remove(agenciaX);
    }

    // Método para notificar sobre cambios en las acciones
    public void notificarObservadores() {
        for (Observers agenciaX : listaAgenciasObservadoras) {
            agenciaX.actualizar(accion, precio);
        }
    }
    public void establecerPrecio(String accion, double precio) {
        this.accion = accion;
        this.precio = precio;
        notificarObservadores();
    }
}
