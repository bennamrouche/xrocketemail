package com.alphaben.xrocketemail.Files;

import com.alphaben.xrocketemail.Output;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.text.JTextComponent;

/**
 *
 * @author ebennamr
 */

public class FileLoader
{
    public static Set<String> LoadEmailsFromFile(String filePath) throws FileNotFoundException, IOException {
        Set<String> linesSet = new HashSet<>();

       BufferedReader reader = new BufferedReader(new FileReader(filePath));
               
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                linesSet.add(line);
            }
       

        return linesSet;
    }
    
  
public static void loadFileTo(String filePath, JTextComponent target)
{
    
    System.out.print("Laod Email");
        
    StringBuffer buff = new StringBuffer();
   Output out = Output.getInstance(); 
    
       BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
                
        } catch (FileNotFoundException ex) 
        {
            out.error("File not found or permission denied");
            return;
        }
               

        try 
        {
            
            String line = "";
            while ((line = reader.readLine()) != null) {
                buff.append(line);
                buff.append("\n");
            }
        } catch (IOException ex) {
          out.error("Error while reading email content file");

           return;
        }
        
        out.info("Email content file  loaded successfully");
        target.setText(buff.toString());
    }
}
