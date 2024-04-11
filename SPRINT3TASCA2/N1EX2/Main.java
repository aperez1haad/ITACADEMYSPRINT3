package INTELIJ.SPRINT3TASCA2.N1EX2;

public class Main {
    public static void main(String[] args) {

        AgenteSubjectObservable agenteBolsa = new AgenteSubjectObservable();

        AgenciasObservers agenciaX = new AgenciasObservers("AgenciaX");
        AgenciasObservers agenciaY = new AgenciasObservers("AgenciaY");
        AgenciasObservers agenciaZ = new AgenciasObservers("AgenciaZ");

        // Registrar las agencias de bolsa como observadores del agente de bolsa
        agenteBolsa.registrarObservador(agenciaX);
        agenteBolsa.registrarObservador(agenciaY);
        agenteBolsa.registrarObservador(agenciaZ);

        agenteBolsa.establecerPrecio("Apple", 150.0);
        agenteBolsa.establecerPrecio("ITAcademy", 2500.0);

        agenteBolsa.eliminarObservador(agenciaY);

    }
}