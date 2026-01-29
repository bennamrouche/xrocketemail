package com.alphaben.xrocketemail;

import com.alphaben.xrocketemail.ui.MainFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @version 1.0.0
 * @author alphaben
 */
public class Main {

    public static void main(String[] args) {

        try {

            UIManager.setLookAndFeel(new com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme());

        } catch (UnsupportedLookAndFeelException e) {
            System.out.print("fail to load LookAndFeel");
        }

        MainFrame fr = new MainFrame(AppDetails.APP_NAME + " " + AppDetails.VERSION);
        fr.setVisible(true);

    }
}
