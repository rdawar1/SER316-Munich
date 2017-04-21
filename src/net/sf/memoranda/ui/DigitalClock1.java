package net.sf.memoranda.ui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.text.*;
import javax.swing.Timer;
/* By Rahul Daawr
The class uses singleton design pattern to create a Digital clock. 

*/
class DigitalClock1  {
 
  private static DigitalClock1 ck;

  SimpleDateFormat sdf2;
  SimpleDateFormat sdf3;
  
  
  
  private DigitalClock1()
  {
	    ClockLabel dateLable = new ClockLabel("date");
	    ClockLabel timeLable = new ClockLabel("time");
	    ClockLabel dayLable = new ClockLabel("day");
	 
	    JFrame.setDefaultLookAndFeelDecorated(true);
	    JFrame frame = new JFrame("Clock");
	    frame.setSize(600,150);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setLayout(new GridLayout(3, 1));
	 
	    frame.add(dateLable);
	    frame.add(timeLable);
	    frame.add(dayLable);
	 
	    frame.getContentPane().setBackground(Color.black);
	 
	    frame.setVisible(true);
  }

  
  public static DigitalClock1 getInstance()
  {
	  
	  if(ck == null)
	  {
		  ck = new DigitalClock1();
		  return ck;
	  }
	  else
	  {
		  return ck;
	  }
  }
}


 class  ClockLabel extends JLabel implements ActionListener
 {
	  String type;
	  SimpleDateFormat sdf;
  public ClockLabel(String type) {
    this.type = type;
    setForeground(Color.red);
 
    if(type.equals("date"))
    {
    	sdf = new SimpleDateFormat("  MMMM dd yyyy");
        setFont(new Font("PHOSPHATE", Font.PLAIN, 18));
        setHorizontalAlignment(SwingConstants.LEFT);
    }
    else if(type.equals("time"))
    {
    	sdf = new SimpleDateFormat("hh:mm:ss a");
        setFont(new Font("PHOSPHATE", Font.PLAIN, 40));
        setHorizontalAlignment(SwingConstants.CENTER);
    }
    else if(type.equals("day"))
    {
    	sdf = new SimpleDateFormat("EEEE  ");
        setFont(new Font("PHOSPHATE", Font.PLAIN, 18));
        setHorizontalAlignment(SwingConstants.RIGHT);
    }
    else
    {
    	sdf = new SimpleDateFormat();
    }

    Timer t = new Timer(1000, this);
    t.start();
  }
 
  public void actionPerformed(ActionEvent ae) {
    Date time = new Date();
    setText(sdf.format(time));
  }
}
