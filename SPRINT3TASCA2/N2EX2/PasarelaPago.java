package INTELIJ.SPRINT3TASCA2.N2EX2;
import INTELIJ.SPRINT3TASCA2.N2EX2.MetodoPago.*;

public class PasarelaPago {
    public void procesarPago(MetodoPago metodoPago, double cantidad) {
        metodoPago.realizarPago(cantidad);
    }
}
