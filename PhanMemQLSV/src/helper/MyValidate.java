/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author NTV
 */
public class MyValidate {
    public static boolean isEmpty(JTextField txtValue, String msg) {
        String txt = txtValue.getText().trim();        
        if(txt.length() == 0) {
            MyMessage.msgWarning(msg);
            txtValue.setBackground(Color.yellow);
            txtValue.requestFocus();
            return true;
        }
        return false;
    }
    
    public static boolean isEmpty(JTextArea txtValue, String msg) {
        String txt = txtValue.getText().trim();        
        if(txt.length() == 0) {
            MyMessage.msgWarning(msg);
            txtValue.setBackground(Color.yellow);
            txtValue.requestFocus();
            return true;
        }
        return false;
    }
    
    public static boolean isEmpty(JPasswordField txtValue, String msg) {
        String txt = String.valueOf(txtValue.getPassword()).trim();
        if(txt.length() == 0) {
            MyMessage.msgWarning(msg);
            txtValue.setBackground(Color.yellow);
            txtValue.requestFocus();
            return true;
        }
        return false;
    }    
 }
