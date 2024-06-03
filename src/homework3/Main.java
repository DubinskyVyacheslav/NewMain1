package homework3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    private static final String [] NAME= new String[]{"Барсик","Мурзик","Кеша","Пушок","Снежок","Сахарок","Багира","Муфаса","Шархан","Симба","Нала","Гарфилд","Лео","Дымок","Пират","Боня","Соня"};
    static Random random = new Random();

    public static void main(String[] args){
        Cat cat = new Cat();
        System.out.println("Через цикл while");
        cat.catWhile();
        System.out.println();
        System.out.println("Через цикл for");
        for (int i = 1; i <=10 ; i++) {
            Cat catFor = new Cat();
            catFor.setName(NAME[random.nextInt(NAME.length)]);
            catFor.setAge(random.nextInt(28));
            System.out.println("Котик №" + i + "Имя:" + catFor.getName() + ". Возраст:" + catFor.getAge());
        }
        System.out.println();
        System.out.println("Через цикл do while");
        int i=0;
        do{
            Cat catDowhile = new Cat();
            catDowhile.catDoWhile(NAME[random.nextInt(NAME.length)],random.nextInt(28) );
            i++;
        }while (i<=10);
        System.out.println();
        System.out.println("Через цикл for each");
        System.out.println();
        Cat catForEach = new Cat();
        System.out.print("Введите сколько хотите котиков: ");
        catForEach.catForEach(scanner.nextInt());






    }

}
