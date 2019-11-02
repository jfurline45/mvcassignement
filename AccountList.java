/**
	File name: AccountList.java
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

/**
 *
 * @author jfurl
 */
public class AccountList  extends java.util.Observable{

  private JFrame o;
        private JPanel t;
      
	// Co
AccountList ()
{
    List();
}
  
    public void  List(){
            o= new JFrame("Account List  ");
            o.setSize(400,400);
           
                   o.setVisible(true);
                   o.setLayout(new BorderLayout());
              t = new JPanel(new GridLayout(5,2));


            t = new JPanel();
            t.setBackground(Color.blue);
            
         
	}

}