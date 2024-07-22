
package com.alphaben.xrocketemail.Files;

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
   
   private static  JFileChooser  chooser = new JFileChooser();
    
public static HashSet<String> choose(String tile)
    {
        HashSet<String> files = new HashSet<String>();
        chooser.setDialogTitle(tile);
        chooser.setMultiSelectionEnabled(true);
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnValue = chooser.showOpenDialog(null);
        if(JFileChooser.APPROVE_OPTION == returnValue )
        {
            for(File file: chooser.getSelectedFiles())
                files.add(file.getAbsolutePath());
        }
        
        return files;
            
    }

public static Optional<String> choose()
    {

        chooser.setDialogTitle("Select File");
        chooser.setMultiSelectionEnabled(false);
        
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnValue = chooser.showOpenDialog(null);
        if(JFileChooser.APPROVE_OPTION == returnValue )
        {
             return Optional.of(chooser.getSelectedFile().getAbsolutePath());
        }
  
        return Optional.empty();
            
    }
}
