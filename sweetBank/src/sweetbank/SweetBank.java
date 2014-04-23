/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sweetbank;


/**
 *
 * @author davidmunro
 */
public class SweetBank {
   
    public static void main(String[] args) {
        login lg = new login();
        lg.getData();
        LoginScreen screen = new LoginScreen();
        screen.setVisible(true);
        
       
    }
}
