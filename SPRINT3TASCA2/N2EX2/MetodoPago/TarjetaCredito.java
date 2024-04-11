package INTELIJ.SPRINT3TASCA2.N2EX2.MetodoPago;

public class TarjetaCredito implements MetodoPago {
    @Override
    public void realizarPago(double cantidad) {
        System.out.println("Pago realizado con tarjeta de crédito por $" + cantidad);
    }
}
