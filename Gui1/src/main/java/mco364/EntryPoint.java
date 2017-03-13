package mco364;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EntryPoint {

    public static void main(String[] args) {
        // JFrame = windowed app
        // // center of JFrame
        // -- JPanel - component contains other componenets
        // -- JLabel (unediatble) -- botom of JPanel
        // Layouts - BorderLayout (JFrame default)
        //         - FlowLayout (default all else)
        //         - GridLayout -- n x m grid of cells
        //         = GridBagLayout - create a cell as large as a x b cells
        //        
        // -- event handler
        // -- executable jar with icon

        JFrame app = new JFrame("Calculator");
        app.setLayout(new GridLayout(4, 3, 5, 5));
        //app.setLayout(new BorderLayout()); // not needed since BorderLayout is default for JFRame
        // app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // equiv to
        app.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                boolean unsavedChanges = false;
                if (unsavedChanges == true) { // dirtyBit : https://en.wikipedia.org/wiki/Dirty_bit

                }
                System.exit(0);
            }

        });
        app.setSize(400, 200);

        JPanel mainPanel = new JPanel(); // lightweight -- implement in pure Java
        app.add(mainPanel, BorderLayout.CENTER);
        app.add(new JLabel("App has started..."), BorderLayout.SOUTH);

        for (int i = 0; i < 10; i++) { // i is auotmatic variable 
            // that gets created on this line and is destoyed when 
            // block / method exits
            final int ii = i;
            JButton b = new JButton(i + "");
            app.add(b);
            b.addActionListener(new ActionListener() {
                // final int ouputVal;
                @Override
                public void actionPerformed(ActionEvent ae) {

                    System.out.println(ii); // why must i be final
                }
            });
        }

        app.setVisible(true);
        System.out.println("End");
    }
}
