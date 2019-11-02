package mvcassignement;

/**
	File name: View.java
	Short description:
	IST 242 Assignment:
	@author Jared Furline
	@version 1.01 ?/??/????
*/

import java.awt.*;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Observable;
/**
 *
 * @author jfurl
 */
public class CreateANewAccountView extends java.util.Observable{


	// Instance Variables -- define your private data

        private JFrame f;
        private JPanel p;
        private JButton b1;
        private JLabel lab;
	// Co
CreateANewAccountView ()
{
account();
}
  
    public void  account (){
            f= new JFrame("bank account");
            f.setSize(200,400);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                   f.setVisible(true);
                   f.setLayout(new BorderLayout());
              p = new JPanel(new GridLayout(5,2));


            p = new JPanel();
            p.setBackground(Color.gray);
            
          b1 = new JButton("Create");  
           lab = new JLabel("Create A New Account");
           p.add(b1);
           p.add(lab);	
           f.add(p);
        
		
		
		
		f.setSize(200,100);

	f.setVisible(true);
	}
}
	

	