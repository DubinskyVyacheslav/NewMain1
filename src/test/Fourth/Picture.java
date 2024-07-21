package test.Fourth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class Picture extends JComponent implements KeyListener, ActionListener {

    Image pict = new ImageIcon("src/resources/Таблица цветов.jpg").getImage();
    public static Scanner scanner = new Scanner(System.in);

    public void paint(Graphics g){
        Graphics gr = (Graphics2D)g;
        gr.drawImage(pict,0,0,null);
    }

    public void getPicture(){

        Picture t = new Picture();
        JFrame f = new JFrame("Таблица цветов");
        f.setSize(1300,340);
        f.addKeyListener(t);
        f.add(new Picture());
        f.add(t);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
        }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
