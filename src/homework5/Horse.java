package homework5;

public class Horse extends Animal{

    String colorMane;
    protected String food = "Сено";
    protected String location ="В поле";

    @Override
    public void makeNoise(String Animal) {
        System.out.println("И-ГО-ГО");
    }

    @Override
    public void eat(String Animal) {
        System.out.println("Лошадь кушает");
    }



}
