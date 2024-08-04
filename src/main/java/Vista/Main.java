
package Vista;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                 Seleccion seleccion = new Seleccion();
                 seleccion.setVisible(true);
            }
        });
    }
}