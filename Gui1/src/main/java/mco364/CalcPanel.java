package mco364;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CalcPanel extends JPanel {

    private class NumberButtonListener implements ActionListener {
//        private int num;
//
//        NumberButtonListener(int i) {
//            num = i;
//        }
        // final int ouputVal;

        @Override
        public void actionPerformed(ActionEvent ae) {
            //System.out.println(ae.getActionCommand());
            JButton b = (JButton) ae.getSource();
            System.out.println(b.getName());
            
        }
    }

    public CalcPanel() {

        setLayout(
                new GridLayout(4, 3, 5, 5));
         NumberButtonListener nbl = new NumberButtonListener();
        //A closure is a block of code that can be referenced (and passed around) with access to the variables of the enclosing scope.
        // http://stackoverflow.com/questions/5443510/closure-in-java-7
        for (int i = 0;
                i < 10; i++) {
            // i is auotmatic variable
            // that gets created on this line and is destoyed when
            // block / method exits
            JButton b = new JButton(i + "");
            b.setName(i + "");
            add(b);
            b.addActionListener(nbl);
        }
    }

}
