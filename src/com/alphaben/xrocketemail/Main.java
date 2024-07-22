
package com.alphaben.xrocketemail;


import com.alphaben.xrocketemail.ui.MainFrame;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;


/**
 *
 * @author ebennamr
 */

public class Main {

    public static void main(String[] args) {
      
        try {
            
                   UIManager.setLookAndFeel(new FlatLightLaf());
          } 
        catch (Exception e)
        {
           
        }
        
        MainFrame fr = new MainFrame(App.AppName + " " + App.Version );
        fr.setVisible(true);
       
    }
}
