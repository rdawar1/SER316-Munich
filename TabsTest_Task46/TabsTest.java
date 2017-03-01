// This is just for the purpose of testing out Tabs and their functionality and figuring 
// out how to put them in memoranda


import java.awt.*;
import javax.swing.*;


// Creates a Jframe and Saperates different panels with tabs
public class TabsTest extends JFrame
{
	JTabbedPane tabsP1=new JTabbedPane();
	JTabbedPane tabsT1=new JTabbedPane();
	JPanel proj1,proj2,proj3;
	
	// Constructor
	TabsTest()
	{
		setTitle("Testing Out Tabs To Put In Memoranda"); 
		setSize(700,500);
		setVisible(true);
		
		proj1=new JPanel();
		proj2=new JPanel();
		proj3 = new JPanel();
		
		tabsP1.addTab("ProjectName1",proj1);
		tabsP1.addTab("ProjectName2", proj2);
		
		tabsP1.addTab("ProjectName3", proj3);
		
		
		 add(tabsP1);
		
	}
	
	public static void main(String[] args) 
	{



		
				new TabsTest();


	}






}