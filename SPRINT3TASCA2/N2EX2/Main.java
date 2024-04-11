package INTELIJ.SPRINT3TASCA2.N2EX2;
import INTELIJ.SPRINT3TASCA2.N2EX2.MetodoPago.*;

public class Main {
    public static void main(String[] args) {
        // Crear la pasarela de pago
        PasarelaPago pasarelaPago = new PasarelaPago();

        // Crear la tienda de zapatos
        TiendaZapatos JDSports  = new TiendaZapatos(pasarelaPago);

        MetodoPago tarjetaCredito = new TarjetaCredito();
        JDSports.comprarZapatos(100.0, tarjetaCredito);

        MetodoPago paypal = new PayPal();
        JDSports.comprarZapatos(50.0, paypal);

        MetodoPago debitoBancario = new DebitoBancario();
        JDSports.comprarZapatos(75.0, debitoBancario);
    }
}
