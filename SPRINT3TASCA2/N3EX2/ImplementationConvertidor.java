package INTELIJ.SPRINT3TASCA2.N3EX2;
import java.util.HashMap;

public class ImplementationConvertidor implements ConvertidorMoneda {
    private HashMap<String, Double> mapTasasDeCambio;
    public ImplementationConvertidor() {
        mapTasasDeCambio = new HashMap<>();
        mapTasasDeCambio.put("USD", 1.0);
        mapTasasDeCambio.put("EUR", 0.85);
        mapTasasDeCambio.put("GBP", 0.72);
    }
    @Override
    public double convertir(double precio, String monedaDestino) {
        if (mapTasasDeCambio.containsKey(monedaDestino)) {
            double tasaDeCambio = mapTasasDeCambio.get(monedaDestino);
            return precio * tasaDeCambio;
        } else {
            System.out.println("No se encontró la tasa de cambio para la moneda " + monedaDestino);
            return precio;
        }
    }
}
