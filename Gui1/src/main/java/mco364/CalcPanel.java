package mco364;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CalcPanel extends JPanel {

    public CalcPanel() {
        setLayout(new GridLayout(4, 3, 5, 5));
        //A closure is a block of code that can be referenced (and passed around) with access to the variables of the enclosing scope.
        // http://stackoverflow.com/questions/5443510/closure-in-java-7
        for (int i = 0; i < 10; i++) {
            // i is auotmatic variable
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
