package HomeWork2;

import java.awt.*;
import java.util.Scanner;

public class rainbow {


    Scanner scanner = new Scanner(System.in);

    private static String yesNo;
    private static int Number;

    private static String Color;

    private static String Color2;

    public rainbow(int a) {

        this.Number = a;

        switch (a) {
            case 1:
                Color = "Красный";
                break;
            case 2:
                Color = " оранжевый";
                break;
            case 3:
                Color = "жёлтый";
                break;
            case 4:
                Color = "зелёный";
                break;
            case 5:
                Color = "голубой";
                break;
            case 6:
                Color = "синий";
                break;
            case 7:
                Color = "фиолетовый";
                break;
            default:

        }

        this.Color = Color;


        System.out.println("Хотите смешать цвета? (Да/Нет)");

        yesNo = scanner.nextLine();

        String lowerYesNo = yesNo.toLowerCase();

        if (lowerYesNo.equals("да")) {

            System.out.println("С каким цветом?");
            System.out.println("(1-Красный,2-оранжевый,3-жёлтый,4-зелёный,5-голубой,6-синий,7-синий)");
            int b = scanner.nextInt();


            if (b == 1) {
                Color2 = "Красный";
            } else if (b == 2) {
                Color2 = " оранжевый";

            } else if (b == 3) {
                Color2 = "жёлтый";
            } else if (b == 4) {
                Color2 = "зелёный";

            } else if (b == 5) {
                Color2 = "голубой";

            } else if (b == 6) {
                Color2 = "синий";

            } else if (b == 7) {
                Color2 = "синий";

            } else {
                System.out.println("Введите число от 1 до 7");

                for (int c = 0; c < 100; c++) {
                    System.out.println("Eror");
                }
                System.out.println("Введите число от 1 до 7");

            }
            this.Color2 = Color2;
        }
    }
    public static void getName () {

        if (0 < Number && Number < 8 && Color2 != null) {
            System.out.println("Ваш цвет: " + Color + "-" + Color2);
        } else if (0 < Number && Number < 8 && Color2 == null) {
            System.out.println("Ваш цвет: " + Color);
        } else {
            System.out.println("Eror");
            System.out.println("Введите число от 1 до 7");
        }
    }

}


