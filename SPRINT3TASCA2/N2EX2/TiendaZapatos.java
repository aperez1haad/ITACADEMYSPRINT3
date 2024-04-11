package INTELIJ.SPRINT3TASCA2.N2EX2;
import INTELIJ.SPRINT3TASCA2.N2EX2.MetodoPago.*;

public class TiendaZapatos {
    private PasarelaPago pasarelaPago;

    public TiendaZapatos(PasarelaPago pasarelaPago) {
        this.pasarelaPago = pasarelaPago;
    }
    public void comprarZapatos(double precio, MetodoPago metodoPago) {
        System.out.println("Compra realizada en la tienda de zapatos por $" + precio);
        pasarelaPago.procesarPago(metodoPago, precio);
    }
}
