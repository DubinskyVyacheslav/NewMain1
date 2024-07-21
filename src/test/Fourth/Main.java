package test.Fourth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {

        Picture picture = new Picture();
        picture.getPicture();
        CommandCenter commandCenter = new CommandCenter();
        Constant constant = new Constant();
        constant.welcome();
        int i = 1;
        while (true) {
            if (i == 1) {
                i = commandCenter.start();
            } else if (i == 0) {
                System.out.println("Остановка программы");
                break;
            }

        }
//        System.out.println("\u001b[38;5;210m"+"qwerty"+enumColor[0].getCodColor());
//        String test = "\u001b[38;5;200m"+"qwerty"+enumColor[0].getCodColor()+" Я покрасил qwerty";
//        System.out.println(test);
//        System.out.println("\u001b[38;5;"+"200"+"m"+"И так цвет можно менять"+enumColor[0].getCodColor());

//        System.out.print("  Доступные цвета:" +
//                "\n  1." +enumColor[1].getCodColor() +"BLACK"+enumColor[0].getCodColor()+"    5."+enumColor[5].getCodColor() +"BLUE\n"+enumColor[0].getCodColor()+
//                "  2."+enumColor[2].getCodColor() +"RED"+enumColor[0].getCodColor()+     "      6."+enumColor[6].getCodColor() +"PURPLE\n"+enumColor[0].getCodColor()+
//                "  3."+enumColor[3].getCodColor() +"GREEN"+enumColor[0].getCodColor()+   "    7."+enumColor[7].getCodColor() +"CYAN\n"+enumColor[0].getCodColor()+
//                "  4."+enumColor[4].getCodColor() +"YELLOW"+enumColor[0].getCodColor()+  "   8."+enumColor[8].getCodColor() +"WHITE\n"+enumColor[0].getCodColor());
//
//        System.out.println("\nКакого цвета фигуру вы хотите?  (Только английский)");
//        rectangle1.draw(scanner.nextLine());
//        rectangle1.draw(3);
//
//
    }
}

