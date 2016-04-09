package se.holmqvist;

import javax.swing.*;
import java.awt.*;

/**
 * Created by chrhol on 2016-04-07.
 */
public class DonutExample extends JFrame{

    public DonutExample(){
        initUI();
    }

    private void initUI(){
        add(new DonutBoard());
        setSize(300,300);
        setTitle("Donut");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DonutExample ex = new DonutExample();
                ex.setVisible(true);
            }
        });
    }


}
