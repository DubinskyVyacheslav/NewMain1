package test.Fourth;

import java.util.Scanner;

public class CommandCenter {

    Scanner scanner = new Scanner(System.in);
    Circle circle = new Circle();
    Rectangle rectangle = new Rectangle();

    public int start() {

        int a = 1;
        System.out.println("Какую операцию хотите провести?");
        int index = scanner.nextInt();

        if (index == 1) {
            System.out.println("Введите число выводимых прямоугольников и их цвет (номером).");
            rectangle.draw(new Scanner(System.in).nextInt(), new Scanner(System.in).nextLine());
        } else if (index == 2) {
            System.out.println("Введите цвет выводимого прямоуголтника.");
            rectangle.draw(new Scanner(System.in).nextLine());
        } else if (index == 3) {
            System.out.println("Введите количество выводимых прямоугольников.");
            rectangle.draw(new Scanner(System.in).nextInt());
        } else if (index == 4) {
            System.out.println("Введите число выводимых кругов и их цвет (номером).");
            circle.draw(new Scanner(System.in).nextInt(), new Scanner(System.in).nextLine());
        } else if (index == 5) {
            System.out.println("Введите цвет выводимого круга.");
            circle.draw(new Scanner(System.in).nextLine());
        } else if (index == 6) {
            System.out.println("Введите количество выводимых кругов.");
            circle.draw(new Scanner(System.in).nextInt());
        } else if (index == 0) {
            a = 0;
        }
        return a;
    }
}
