package se.holmqvist;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by chrhol on 2016-04-07.
 */
public class SwingBoard extends JPanel implements ActionListener {
    private final int B_WIDTH = 350;
    private final int B_HEIGHT = 350;
    private final int INITIAL_X = -40;
    private final int INITIAL_Y = -40;
    private final int DELAY = 25;

    private Image star;
    private Timer timer;
    private int x,y;

    public SwingBoard() {
        initBoard();
    }


    private void loadImage() {
        ImageIcon ii = new ImageIcon("star.png");
        star = ii.getImage();
    }

    private void initBoard() {
        setBackground(Color.black);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        setDoubleBuffered(true);

        loadImage();

        x = INITIAL_X;
        y = INITIAL_Y;

        timer = new Timer(DELAY,this);
        timer.start();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawStar(g);
    }

    private void drawStar(Graphics g) {
        g.drawImage(star,x,y,this);
        Toolkit.getDefaultToolkit().sync();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x += 1;
        y += 1;

        if(y > B_HEIGHT) {
            y = INITIAL_Y;
            x = INITIAL_X;
        }

        repaint();

    }
}
