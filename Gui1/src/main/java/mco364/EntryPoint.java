package mco364;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EntryPoint {
    
    
    
    public int bar(){return 1;}
    
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
