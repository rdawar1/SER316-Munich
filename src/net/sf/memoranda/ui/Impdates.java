//The Impdates list all the important dates in your 
//calender so you do not forget about them.
//The important dates include dates you have tasks due and holidays
package net.sf.memoranda.ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Impdates extends JDialog implements ActionListener{
	static String[] dates = new String[100];
	int i=0;
	JTextField text, text1;
	 JButton submit, convert1;;
	public boolean unitTest;
	private static Impdates I;
	
	public boolean x = false;
public Impdates() {
		
	
 JFrame frame = new JFrame("Important Dates");
 JPanel panel = new JPanel();
 panel.setLayout(new FlowLayout());
 JPanel panel1 = new JPanel();
 panel1.setLayout(new FlowLayout());
 
 JButton button1 = new JButton();
 JLabel label1 = new JLabel(" ASU Holidays!");
 JLabel labeltryy = new JLabel(dates[i]);
 JLabel label2 = new JLabel("Spring Break : 5-12th April"); 
 JLabel label3 = new JLabel("Lovers Day : October 28");
 JLabel label4 = new JLabel("\n");





 frame.add(panel);
 frame.setSize(300, 300);
 frame.setLocationRelativeTo(null);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);

 panel.add(label1);
 //panel.add(button1);
 panel.add(label2);
 panel.add(label3);
 panel.add(label4);
 panel.add(labeltryy);

 frame.add(panel1);
 frame.setSize(300, 300);
 frame.setLocationRelativeTo(null);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 x = true;


text=new JTextField("Add Important Date");	
submit=new JButton("submit");
this.setModal(true);
this.setLayout(null);
this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
this.setLocationRelativeTo(null);
this.setSize(370, 300);
this.setTitle("Access Important Dates");
	 this.setResizable(false);


text.setBounds(30,50,280,30);

submit.setBounds(30,150,280,30);





this.add(text);
this.add(submit);
submit.addActionListener(this);




this.setVisible(true); 
}

public static Impdates getI()
{
	if( I == null)
	{
		I = new Impdates();
		return I;
	}
	return I;
}

@Override
public void actionPerformed(ActionEvent e) {
	//for ( i=0; i < dates.length; i++)
	{
		if(e.getSource()==submit)
		{
	        dates[i] = text.getText();
	        // this.dispose();
	        //getI();
	        new Impdates();
		}
		
	}

	
}
}
