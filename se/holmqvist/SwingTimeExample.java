package se.holmqvist;

import javax.swing.*;
import java.awt.*;

/**
 * Created by chrhol on 2016-04-07.
 */
public class SwingTimeExample extends JFrame {
    public SwingTimeExample(){
        initUI();
    }

    private void initUI() {
        add(new SwingBoard());

        setResizable(false);
        pack();

        setTitle("SwingStar");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame ex = new SwingTimeExample();
                ex.setVisible(true);
            }
        });
    }
}
