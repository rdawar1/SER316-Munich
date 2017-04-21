
//The Impdates list all the important dates in your 
//calender so you do not forget about them.
//The important dates include dates you have tasks due and holidays
package net.sf.memoranda.ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Impdates extends JDialog implements ActionListener{
	
	JTextField text, text1;
	 JButton submit, convert1;;
	public boolean unitTest;
	
	public boolean x = false;
public Impdates() {
		
	
 JFrame frame = new JFrame("Important Dates");
 JPanel panel = new JPanel();
 panel.setLayout(new FlowLayout());
 JPanel panel1 = new JPanel();
 panel1.setLayout(new FlowLayout());
 JLabel label = new JLabel("Things due This Week!"); 

 JButton button = new JButton();
 button.setText("Open List");
 JButton button1 = new JButton();
 //button.setText("");
 JLabel label1 = new JLabel(" ASU Holidays! : ");
 JLabel label2 = new JLabel("Spring Break : 5-12th April"); 
 JLabel label3 = new JLabel("Lovers Day : October 28");
 JLabel label4 = new JLabel("\n");


 panel.add(label);
 panel.add(button);


 frame.add(panel);
 frame.setSize(300, 300);
 frame.setLocationRelativeTo(null);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);

 panel.add(label1);
 panel.add(button1);
 panel.add(label2);
 panel.add(label3);
 panel.add(label4);

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



submit.addActionListener(this);
this.add(text);
this.add(submit);




this.setVisible(true); 
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
