package INTELIJ.SPRINT3TASCA2.N2EX2.MetodoPago;

public class DebitoBancario implements MetodoPago {
@Override
public void realizarPago(double cantidad) {
        System.out.println("Pago realizado con débito bancario por $" + cantidad);
        }
}
