/**
	File name: Accessanexistingaccountview.java
	Short description:
	IST 242 Assignment:
	@author Jared Furline
	@version 1.01 ?/??/????
*/
package mvcassignement;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Observable;
/**
 *
 * @author jfurl
 */
public class Accessanexistingaccountview  extends java.util.Observable{

        private JFrame g;
        private JPanel s;
        private JButton b2,b3,b4;
        private JLabel gog;
	// Co
Accessanexistingaccountview ()
{
    secondview();
}
  
    public void  secondview(){
            g= new JFrame("Access an existing account ");
            g.setSize(600,400);
           
                   g.setVisible(true);
                   g.setLayout(new BorderLayout());
              s = new JPanel(new GridLayout(5,2));


            s = new JPanel();
            s.setBackground(Color.orange);
            
          b2 = new JButton("Select Account");  
          b3 = new JButton("Deposit");  
            b4 = new JButton("Withdraw"); 
           gog = new JLabel("Test");
           s.add(b2);
           s.add(b3);
           s.add(b4);
           s.add(gog);	
           g.add(s);
           
	}

}