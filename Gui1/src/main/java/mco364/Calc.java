package mco364;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class Calc extends JFrame {

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
        textPanel.setText("<strong><small>1234</small></strong><br><div align=\"right\">" +
"QWE</div>");
        JPanel mainPanel2 = new CalcPanel(); // lightweight -- implement in pure Java
        add(mainPanel2, BorderLayout.CENTER);
        JLabel statusBar = new JLabel("App has started...");
        add(statusBar, BorderLayout.SOUTH);
        add(textPanel, BorderLayout.NORTH);
        setVisible(true);
    }

}
