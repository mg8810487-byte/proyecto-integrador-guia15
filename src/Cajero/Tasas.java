package Cajero;

import java.io.IOException;

public class Tasas {
    public static double cargarTasa(String archivo) throws IOException {
        if (!archivo.endsWith(".csv")) {
            throw new IOException("Formato no soportado: " + archivo);
        }
        return 0.05;
    }
}
