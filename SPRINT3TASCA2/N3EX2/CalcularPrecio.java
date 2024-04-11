package INTELIJ.SPRINT3TASCA2.N3EX2;

public class CalcularPrecio {
    private ConvertidorMoneda convertidor;

    public CalcularPrecio(ConvertidorMoneda convertidor) {
        this.convertidor = convertidor;
    }
    public void mostrarPrecio(String articulo, double precio, String monedaDestino) {
        double precioConvertido = convertidor.convertir(precio, monedaDestino);
        System.out.println("Artículo: " + articulo + ", Precio en " + monedaDestino + ": " + precioConvertido);
    }
}
