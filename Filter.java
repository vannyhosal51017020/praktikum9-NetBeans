/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Filter {
    public static void digitalFilter(KeyEvent evt) {
        char input = evt.getKeyChar();
        if (!((Character.isDigit(input)) || 
                (input == KeyEvent.VK_BACK_SPACE)   ||
                (input == KeyEvent.VK_DELETE))) {
            
            new JFrame().getToolkit().beep();
            JOptionPane.showMessageDialog(null, "error");
            evt.consume();
        }
    }
}
