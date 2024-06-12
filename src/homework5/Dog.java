package homework5;

public class Dog extends Animal{


    String favoriteToy;
    protected String food = "Мясо";
    protected String location ="Во дворе";

    @Override
    public void makeNoise(String Animal) {
        System.out.println("ГАВ");
    }

    @Override
    public void eat(String Animal) {
        System.out.println("Собачка кушает");
    }


}
