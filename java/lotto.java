/*
/ PantherID:  [6168616]
// CLASS: COP 2210 – [Fall 2019]
// ASSIGNMENT # [1]
// DATE: [9/14/2019]
//// I hereby swear and affirm that this work is solely my own, and not the work or the derivative of the work of someone else.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotto.java;
/**
 *
 * @author garci
 */
import java.util.Random;
import javax.swing.JOptionPane;
public class lotto {
    public static void main(String[] args) {
    

 {

Random fanstasy = new Random();  
int x = 1 + fanstasy.nextInt(36);
Random lotto = new Random ();
int y = 1 + lotto.nextInt(53);

System.out.println( (1 + fanstasy.nextInt(36)) + " " + (1 + fanstasy.nextInt(36)) + " " + 1 + fanstasy.nextInt(36) + " " + 1 + fanstasy.nextInt(36) + " " + 1 + fanstasy.nextInt(36) ); 
System.out.println( (1 + lotto.nextInt(53)) + " " + 1 + (lotto.nextInt(53)) + " " + (1 + lotto.nextInt(53)) + " " + (1 + lotto.nextInt(53)) + " " + (1 + lotto.nextInt(53)) + " " + (1 + lotto.nextInt(53)));
JOptionPane.showMessageDialog(null, "winning number\n " + (1 + fanstasy.nextInt(36)) + " " + (1 + fanstasy.nextInt(36)) + " " + (1 + fanstasy.nextInt(36)) + " " + (1 + fanstasy.nextInt(36)) + " " + (1 + fanstasy.nextInt(36)) + System.lineSeparator() + (1 + lotto.nextInt(53)) + " " + (1 + lotto.nextInt(53)) + " " + (1 + lotto.nextInt(53)) + " " + (1 + lotto.nextInt(53)) + " " + (1 + lotto.nextInt(53)) + " " + (1 + lotto.nextInt(53))  ); 

 }
 
 



}
}
        
    

