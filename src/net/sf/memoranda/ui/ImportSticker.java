package net.sf.memoranda.ui;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import net.sf.memoranda.util.Local;

public class ImportSticker {

String name;        
public boolean CANCELLED = false;
        public ImportSticker(String x) {
                name = x;
        }

        public boolean import_file(){
        	AppFrame app = new AppFrame();
        	app.p1Import_actionPerformed();
                /*
                 We are working on this =)
                  
                  
                  */
        	//CANCELLED=false;
        	if(CANCELLED==true){}
                

        	else
        		JOptionPane.showMessageDialog(null,Local.getString("Import Canceled."));
                return true;
        }
        
        
}