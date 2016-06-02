/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compartilhamentoarquivo;

import InterfaceGrafica.ClienteFrame;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Amanda
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Windows".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ClienteFrame c = new ClienteFrame();
                c.setTitle("Compartilhamento de arquivo");
                c.setLocationRelativeTo(null);
                c.setVisible(true);   
            }
        });
    }
}
