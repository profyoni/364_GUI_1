package mco364;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CalcPanel extends JPanel {

    public CalcPanel() {
        setLayout(new GridLayout(4, 3, 5, 5));
        //A closure is a block of code that can be referenced (and passed around) with access to the variables of the enclosing scope.
        // http://stackoverflow.com/questions/5443510/closure-in-java-7
        for (int i = 0; i < 10; i++) { // i is auotmatic variable 
            // that gets created on this line and is destoyed when 
            // block / method exits
            final int ii = i;
            JButton b = new JButton(i + "");
            add(b);
            b.addActionListener(new ActionListener() {
                // final int ouputVal;
                @Override
                public void actionPerformed(ActionEvent ae) {
                    
                    System.out.println(ii); // why must i be final
                }
            });
        }
    }
}

class Calc extends JFrame {
    
    public Calc() {
        super("Calculator");

        //app.setLayout(new BorderLayout()); // not needed since BorderLayout is default for JFRame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // equiv to
//        addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent we) {
//                boolean unsavedChanges = false;
//                if (unsavedChanges == true) { // dirtyBit : https://en.wikipedia.org/wiki/Dirty_bit
//
//                }
//                System.exit(0);
//            }
//
//        });
        setSize(400, 200);

//        JMenuBar menubar = new JMenuBar();
//        JMenu editMenu = new JMenu("Edit");
//        editMenu.add(new JMenuItem("Clear"));
//        editMenu.add(new JMenuItem("Hi"));
//        editMenu.add(new JMenuItem("Bye"));
//        editMenu.addSeparator();
//        
//        JMenuItem exitMenuItem = new JMenuItem("Exit");
//        exitMenuItem.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                System.exit(0);
//            }
//        });
//        editMenu.add(exitMenuItem);
//        menubar.add(editMenu);
        JTextPane textPanel = new JTextPane();
        textPanel.setContentType("text/html");
        textPanel.setText("<strong>1234</strong><br>QWE");
        
        JPanel mainPanel2 = new CalcPanel(); // lightweight -- implement in pure Java
        
        add(mainPanel2, BorderLayout.CENTER);
        
        JLabel statusBar = new JLabel("App has started...");
        add(statusBar, BorderLayout.SOUTH);
        
        add(textPanel, BorderLayout.NORTH);
        
        setVisible(true);
        
    }
}

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

        JFrame app = new Calc();
        
        System.out.println("End");
    }
}
