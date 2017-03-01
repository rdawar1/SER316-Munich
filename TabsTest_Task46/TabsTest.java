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
	JPanel task1, task2, task3;
	
	// Constructor
	TabsTest()
	{
		setTitle("Testing Out Tabs To Put In Memoranda"); 
		setSize(700,500);
		setVisible(true);
		
		proj1=new JPanel();
		
		proj2=new JPanel();
		proj3 = new JPanel();
		
		
		// Sets the position of the Tabs bar within layout. ( combine with other line)
		proj1.setLayout(new BoxLayout(proj1, BoxLayout.Y_AXIS));
		task1 = new JPanel();
		task2 = new JPanel();
		task3 = new JPanel();
		tabsT1.add("Task1", task1);
		tabsT1.add("Task2", task2);
		tabsT1.add("Task3", task3);
		
		tabsP1.addTab("ProjectName1",proj1);
		tabsP1.addTab("ProjectName2", proj2);
		
		tabsP1.addTab("ProjectName3", proj3);
		
		
		// Adds TabsT1 to the panel proj1
		proj1.add(tabsT1);
		// Sets the position of the Tabs bar within layout. ( combine with other line)
		tabsT1.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		
		// Adds the tabs to the JFRAME
		 add(tabsP1);
		
	}
	
	public static void main(String[] args) 
	{



		
				new TabsTest();


	}






}