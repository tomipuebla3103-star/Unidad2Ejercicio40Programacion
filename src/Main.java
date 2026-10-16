//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    TasaBancoCentral Banco = new TasaBancoCentral();
    TasaMercadoLibre Mercado = new TasaMercadoLibre();
    ConversorMoneda Conversor = new ConversorMoneda();

    Conversor.convertir(100, "USD", "ARS",
            Banco.obtenerTasa("USD", "ARS"));

    Conversor.convertir(100, "USD", "ARS",
            Mercado.obtenerTasa("USD", "ARS"));
}
