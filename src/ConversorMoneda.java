public class ConversorMoneda {
    void convertir(double monto, String monedaOrigen, String monedaDestino,
                   double tasa) {

        double resultado = monto * tasa;

        System.out.println(monto + " " + monedaOrigen + " equivalen a "
                + resultado + " " + monedaDestino);
    }
}
