package HomeWork2;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){

        Scanner scanner= new Scanner(System.in);

        System.out.print("Введите номер вашего цвета: ");
        int a = scanner.nextInt();

        rainbow rainbow = new rainbow(a);

        rainbow.getName();

    }
}
