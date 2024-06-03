package homework3;

import java.util.Arrays;
import java.util.Random;


public class Cat {

    private static final String[] NAME = new String[]{"Барсик", "Мурзик", "Кеша", "Пушок", "Снежок", "Сахарок", "Багира", "Муфаса", "Шархан", "Симба", "Нала", "Гарфилд", "Лео", "Дымок", "Пират", "Боня", "Соня"};
    Random random = new Random();
    String catName;
    int catAge;

    public void catWhile() {
        int i = 1;
        while (i <= 10) {

            int age = random.nextInt(28);
            int randomName = random.nextInt(NAME.length);
            String CatName = NAME[randomName];
            System.out.println("Котик №" + i + "Имя:" + CatName + ". Возраст:" + age);
            i++;

        }
    }


    public void setName(String a) {

        this.catName = a;

    }

    public void setAge(int a) {

        catAge = a;

    }

    public String getName() {

        return catName;

    }

    public int getAge() {

        return catAge;

    }


    public void catDoWhile(String name, int age) {

        System.out.println("Имя:" + name + ". Возраст:" + age);

    }


    public void catForEach(int a) {
        String[][] catArray = new String[a][2];
        String[] array = new String[a];
        int b = 0;
        for (String num : array) {
            catArray[b][0] = NAME[random.nextInt(NAME.length)];
            b++;
        }
        int c = 0;
        for (String num : array) {
            catArray[c][1] = String.valueOf(random.nextInt(28));
            c++;
        }

        System.out.println(Arrays.deepToString(catArray));

    }
}
