package Cajero;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Font;


public class Dialogos {

    static void diseno1() {
        JOptionPane.showMessageDialog(null,
                "<html>Horario de atencion:<br>lunes a viernes, 8:00 a 16:00</html>",
                "Aviso importante", JOptionPane.WARNING_MESSAGE);
    }

    static void diseno2() {
        int r = JOptionPane.showConfirmDialog(null,
                "Desea salir del cajero?", "Salir",
                JOptionPane.YES_NO_CANCEL_OPTION);
        String texto;
        if (r == JOptionPane.YES_OPTION) {
            texto = "Hasta pronto";
        } else if (r == JOptionPane.NO_OPTION) {
            texto = "Continuemos";
        } else {
            texto = "Operacion cancelada";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    static void diseno3() {
        String[] ops = { "Consultar saldo", "Depositar", "Salir" };
        int i = JOptionPane.showOptionDialog(null, "Seleccione una operacion",
                "Menu principal", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, ops, ops[0]);
        if (i == JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(null, "Ventana cerrada");
        } else {
            JOptionPane.showMessageDialog(null, "Opcion: " + ops[i]);
        }
    }

    static void diseno4() {
        UIManager.put("OptionPane.messageFont",
                new Font("SansSerif", Font.PLAIN, 18));
        String[] plazos = { "6 meses", "12 meses", "24 meses" };
        Object p = JOptionPane.showInputDialog(null, "Plazo del credito:",
                "Credito", JOptionPane.QUESTION_MESSAGE, null, plazos, plazos[1]);
        if (p == null) {
            JOptionPane.showMessageDialog(null, "Sin seleccion");
        } else {
            JOptionPane.showMessageDialog(null, "Plazo elegido: " + p);
        }
    }

    public static void main(String[] args) {

    }
}