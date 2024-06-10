package homework4;


import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        Matrix matrix = new Matrix();

        String[][] myMatrix = matrix.createRandomMatrix(10);
        System.out.println(Arrays.deepToString(myMatrix));

        String[] mainDiagonal = matrix.mainDiagonal(myMatrix);
        System.out.println(Arrays.toString(mainDiagonal));

        String[] supportingDiagonal = matrix.supportingDiagonal(myMatrix);
        System.out.println(Arrays.toString(supportingDiagonal));


        String[] diagonals = matrix.createDiagonals(mainDiagonal,supportingDiagonal);
        System.out.println(Arrays.toString(diagonals));

        StringBuilder pointThree = matrix.checkString(diagonals);
        System.out.println(pointThree);


        }


    }


