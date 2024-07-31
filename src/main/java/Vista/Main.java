
package Vista;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Crear y mostrar la ventana de login
//                 Login login = new Login();
//                 login.setVisible(true);
                   MenuClientes menuc = new MenuClientes();
                   menuc.setVisible(true);
//                 Menu menu = new Menu();
//                 menu.setVisible(true);
            }
        });
    }
}