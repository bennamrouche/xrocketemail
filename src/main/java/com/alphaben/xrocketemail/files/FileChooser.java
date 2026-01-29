
package com.alphaben.xrocketemail.files;

import java.io.File;
import java.util.HashSet;
import java.util.Optional;
import javax.swing.JFileChooser;

/**
 *
 * @author ebennamr
 */




public class FileChooser 
{
   
   private static final  JFileChooser  CHOOSER = new JFileChooser();
    
public static HashSet<String> choose(String tile)
    {
        HashSet<String> files = new HashSet<>();
        CHOOSER.setDialogTitle(tile);
        CHOOSER.setMultiSelectionEnabled(true);
        CHOOSER.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnValue = CHOOSER.showOpenDialog(null);
        if(JFileChooser.APPROVE_OPTION == returnValue )
        {
            for(File file: CHOOSER.getSelectedFiles())
                files.add(file.getAbsolutePath());
        }
        
        return files;
            
    }

public static Optional<String> choose()
    {

        CHOOSER.setDialogTitle("Select File");
        CHOOSER.setMultiSelectionEnabled(false);
        
        CHOOSER.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnValue = CHOOSER.showOpenDialog(null);
        if(JFileChooser.APPROVE_OPTION == returnValue )
        {
             return Optional.of(CHOOSER.getSelectedFile().getAbsolutePath());
        }
  
        return Optional.empty();
            
    }
}
