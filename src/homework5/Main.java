package homework5;

public class Main {

    public static void  main(String[] args){

        Dog dog = new Dog();
        Cat cat = new Cat();
        Horse horse = new Horse();
       Animal[] animal = new Animal[]{dog,cat,horse};

       Veterinarian veterinarian = new Veterinarian();

        veterinarian.treatAnimal(animal);


    }
}
