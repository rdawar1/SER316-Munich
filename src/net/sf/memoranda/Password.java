// Written By Rahul Dawar
package net.sf.memoranda;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
 
// This class creates a dialog that asks the user for username and password before thet can log into memoranda.
public class Password extends JDialog implements ActionListener {
	
	
	 JTextField txt, txt1;
	 boolean ret = false;
	 JButton submit, convert1;;
	 

	Password()
	{
	
		txt=new JTextField("User Name");
		txt1=new JTextField("Password");
		submit=new JButton("submit");
		
		
		this.setModal(true);
		this.setLayout(null);
            	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            	this.setLocationRelativeTo(null);
            	this.setSize(370, 300);
            
           	 this.setTitle("Access Password Manager");
           	 this.setResizable(false);
			

		txt.setBounds(30,50,280,30);
		txt1.setBounds(30,100,280,30);
		submit.setBounds(30,150,280,30);
		
	
		
		submit.addActionListener(this);
		this.add(txt);
		this.add(submit);
		this.add(txt1);
		
		
	
		this.setVisible(true);
		
		
		
		
	}
	
	/**
	 * @param ActionEvent
	 * @return void
	 * actionPerformed() checks for action performed
	 */
	
	public void actionPerformed(ActionEvent e)
	{
				String answer, answer1;
				int x;
		    if(e.getSource()==submit)
			{
				
				if(txt.getText().equals("User Name"))
				{
					
					ret = true;
					dispose();
				}
				else
				{
					System.out.println("Wrong Password");
					
				}
				
				//System.out.println("it was here");
				
					
				
			}
			 
	}
	// the method will be modified
	
	boolean checkPassword()
	{
		
		return ret;
	}

}
