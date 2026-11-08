package Cajero;

public class DepositoGUI {
    static int leerMonto(String texto) {
        int monto = Integer.parseInt(texto.trim());
        if (monto <= 0) {
            throw new IllegalArgumentException(
                    "El monto debe ser mayor que cero");
        }
        return monto;
    }
}