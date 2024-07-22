package com.alphaben.xrocketemail;

/**
 *
 * @author ebennamr
 */
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.Color;
import javax.swing.SwingUtilities;
import javax.swing.text.MutableAttributeSet;

public class Output {

    private static Output instance;
    private JTextPane textPane;

    private Output(JTextPane textPane) {
        this.textPane = textPane;
    }

    public static Output getInstance(JTextPane textPane) {
        if (instance == null) {
            instance = new Output(textPane);
        }
        return instance;
    }
    
       public static Output getInstance()
       {
            return instance;
       }

    public void error(String message) {
        appendToPane("[Error] " + message, Color.RED);
    }

    public void info(String message) {
        appendToPane("[Info] " + message, Color.GREEN);
    }

    public void warning(String message) {
        appendToPane("[Warning] " + message, Color.yellow);
    }

    private void appendToPane(String message, Color color) {
        AttributeSet attr = new SimpleAttributeSet();
        StyleConstants.setForeground((MutableAttributeSet) attr, color);
        
        SwingUtilities.invokeLater(() -> {
          
        try {
        
            textPane.getDocument().insertString(textPane.getDocument().getLength(), message + "\n", attr);
           
            
        } catch (BadLocationException e) {
            System.out.print("Oupute.class: BadLocation");
        }
    });
     

    }
}

