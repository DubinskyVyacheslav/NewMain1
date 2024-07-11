package homework9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Закрыть потом 13 и 14 строку
        int result = dividingNumbers(23, 0);
        System.out.println(result);


        int[] myArray = new int[10];

        try {
            myArray[scanner.nextInt()] = 1234;
        } catch (InputMismatchException e ){

            System.out.println(e.getMessage());
            throw new MyException(ExeptionEnum.ONLY_NUMBER,"Только числа!");

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            throw new MyException(ExeptionEnum.INDEX_OUT_OF_BOUND, "Вышел за пределы");
        } finally {
            System.out.println("Для закрытия потока");
        }

    }

    public static int dividingNumbers(int a, int b) throws MyException{
        return linkDividingNumbers(a, b);
    }

    public static int linkDividingNumbers(int dividend, int divider) {

        int a;

        if (divider == 0) {
            throw new MyException(ExeptionEnum.DIVISION_ON_ZERO, "На ноль делить нельзя!");
        }
        else {
            a= dividend/divider;
        }
        return a;
    }
}
