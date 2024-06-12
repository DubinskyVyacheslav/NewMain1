package homework5;

public class Cat extends Animal{

    String favoritefish;
    protected String food = "рыба";
    protected String location ="Дома";

    @Override
    public void makeNoise(String Animal) {
        System.out.println("Мяу");
    }

    @Override
    public void eat(String Animal) {
        System.out.println("Котик кушает");
    }



}
