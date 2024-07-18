package homework10;

import java.util.Scanner;

public class CommandCenter {

    Product product = new Product();
    Scanner scanner = new Scanner(System.in);
    Order order = new Order();

    public int start() {

        int a = 1;
        System.out.println("Какую операцию хотите провести?");
        int index = scanner.nextInt();

        if (index == 1) {
            System.out.println("Вывожу список");
            product.printProperties();
        } else if (index == 2) {
            System.out.println("Какой товар хотите добаваить?");
            product.addProduct(new Scanner(System.in).nextLine());
        } else if (index == 3) {
            System.out.println("Какой товар удалить? (Введите номер товара)");
            product.deleteProduct(new Scanner(System.in).nextInt());
        } else if (index == 4) {
            order.printProperties();
        } else if (index == 5) {
            System.out.println("Какой заказ хотите добаваить?");
            order.addOrder(new Scanner(System.in).nextLine());
        } else if (index == 6) {
            System.out.println("Какой заказ удалить?");
            order.deleteOrder(new Scanner(System.in).nextInt());
        } else if (index == 0) {
            a = 0;
        }
        return a;
    }
}
