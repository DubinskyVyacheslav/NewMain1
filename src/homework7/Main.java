package homework7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        ArrayList <String> arrayList = new ArrayList<>();
//
//        arrayList.add("qfwsafqw");
//        arrayList.add("gr13531");
//        arrayList.add("poiuytr");
//        arrayList.add(".,mnbvc");
//
//        System.out.println(arrayList.size());
//        for (int i=0; i< arrayList.size();i++) {
//            System.out.println(arrayList.get(i));
//        }
//
//        System.out.println("");
//
//        arrayList.add(2,"6j6j5k4");
//
//        for (int i=0; i< arrayList.size();i++) {
//            System.out.println(arrayList.get(i));
//        }


        MyArrayList<String> myArrayList = new MyArrayList<>();

        myArrayList.add("qwerty");
        myArrayList.add("54346");
        myArrayList.add("iuytr");
        myArrayList.add("asdfgh");

        System.out.println(myArrayList.size());

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }

        System.out.println("");

        System.out.println("Есть ли в массиве qwerty? " + myArrayList.contains("qwerty"));
        System.out.println("Есть ли в массиве RandomABC? " + myArrayList.contains("RandomABC"));

        System.out.println("");

        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("ghjkl;");
        arrayList.add("12345;");
        arrayList.add("98765;");
        arrayList.add("gh,mnbvjkl;");
        arrayList.add("mnbvhg';");

//        myArrayList.add(0, "agwrhesrjs");

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }



    }
}
