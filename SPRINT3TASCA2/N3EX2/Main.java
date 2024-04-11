package INTELIJ.SPRINT3TASCA2.N3EX2;

public class Main {
    public static void main(String[] args) {
        ConvertidorMoneda convertidorMoneda = new ImplementationConvertidor();

        CalcularPrecio mostrarPrecioX = new CalcularPrecio(convertidorMoneda);

        mostrarPrecioX.mostrarPrecio("Zapatos", 100.0, "USD");
        mostrarPrecioX.mostrarPrecio("Camisa", 50.0, "EUR");
        mostrarPrecioX.mostrarPrecio("Pantalones", 75.0, "GBP");
    }
}
