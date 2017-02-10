package net.sf.memoranda.ui;

import javax.swing.JOptionPane;

import net.sf.memoranda.util.Local;

public class ImportSticker {

String name;        
        
        public ImportSticker(String x) {
                name = x;
        }

        public boolean import_file(){
                /*
                 We are working on this =)
                  
                  
                  */
                
<<<<<<< HEAD
                JOptionPane.showMessageDialog(null,Local.getString("We can not import your document."));
=======
                JOptionPane.showMessageDialog(null,Local.getString("Aun no podemos importar su documento"));
>>>>>>> 40a595df3fdd26fc636b577ea71669875f1c6bb4
                return true;
        }
        
        
}