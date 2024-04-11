package INTELIJ.SPRINT3TASCA2.N1EX2;

class AgenciasObservers implements Observers {
    private String nombre;
    public AgenciasObservers(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void actualizar(String accion, double precio) {
        System.out.println("[" + nombre + "] Notificación: Precio de " + accion + " ha cambiado a " + precio);
    }
}
