package homework5;

public abstract class Animal {

    protected  String food;
    protected  String location;

    public void makeNoise(String Animal){

        System.out.println(Animal + " шумит");

    }

    public void eat(String Animal){

        System.out.println(Animal + " кушает");

    }

    public void sleep(String Animal){

        System.out.println(Animal + " спит");

    }


}
