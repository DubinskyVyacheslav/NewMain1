package homework5;

public class Veterinarian {

    public void treatAnimal(Animal[] animal){

        for (int i = 0; i <animal.length ; i++) {

            if(animal[i] instanceof Dog ){

                System.out.println(((Dog) animal[i]).food);
                System.out.println(((Dog) animal[i]).location);

            }

            if(animal[i] instanceof Cat ){

                System.out.println(((Cat) animal[i]).food);
                System.out.println(((Cat) animal[i]).location);

            }

            if(animal[i] instanceof Horse ){

                System.out.println(((Horse) animal[i]).food);
                System.out.println(((Horse) animal[i]).location);

            }



        }

    }
}
