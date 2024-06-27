package homework4;

import java.util.Random;

public class Matrix {

    private static char[] abc = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'y', 'z',};
    private static String symbols = "";
    private static double numbers;
    private static int length = 10;
    private static int counter = 1;
    private static int counterForMainDiagonal = 0;
    private static int secondCounter = 0;
    private static String[][] matrix = new String[length][length];
    private static Random random = new Random();

    public String[][] createRandomMatrix(int lengthMatrix) {

        length = lengthMatrix;

        for (int i = 0; i < lengthMatrix; i++) {
            for (int q = 0; q < lengthMatrix; q++) {

                for (int j = 0; j < 7; j++) {

                    symbols = symbols.concat(String.valueOf(abc[random.nextInt(25)]));

                }

                numbers = random.nextDouble(0, 9);
                String result = String.format("%.6f", numbers);

                if (counter % 3 == 0) {

                    matrix[secondCounter][q] = result;

                } else {

                    matrix[secondCounter][q] = symbols;

                }

                counter++;
                symbols = symbols.replaceAll(symbols, "");
            }
            secondCounter++;
        }
        return matrix;
    }

    public String[] mainDiagonal(String matrix[][]) {

        String[] mainDiagonal = new String[length];

        for (int i = 0; i < length; i++) {
            mainDiagonal[i] = matrix[i][counterForMainDiagonal];
            counterForMainDiagonal++;
        }
        return mainDiagonal;

    }

    public String[] supportingDiagonal(String matrix[][]) {

        String[] supportingDiagonal = new String[length];

        for (int i = 0; i < length; i++) {
            supportingDiagonal[i] = matrix[i][length - i - 1];
        }

        return supportingDiagonal;
    }

    public String[] createDiagonals(String[] mainDiagonal, String[] supportingDiagonal) {

        String[] createDiagonals = new String[mainDiagonal.length + supportingDiagonal.length];

        for (int i = 0; i < mainDiagonal.length; i++) {

            createDiagonals[i] = mainDiagonal[i];

        }

        int a = 0;
        for (int i = mainDiagonal.length; i < (mainDiagonal.length + supportingDiagonal.length); i++, a++) {

            createDiagonals[i] = supportingDiagonal[a];

        }
        return createDiagonals;
    }

    public StringBuilder checkString(String[] diagonals) {
        StringBuilder sliceString = new StringBuilder();
        String numbersString;
        Double numbers;
        Double numbersAround;
        Double result;
        boolean resultBoolean;
        for (int i = 0; i < diagonals.length; i++) {
            try {
               Double.parseDouble(diagonals[i]);
                numbers = Double.parseDouble(diagonals[i]);
                numbersString = String.format("%.2f", numbers);
                numbers = Double.parseDouble(numbersString);
                numbersAround = Math.ceil(numbers);

                if (Math.abs(numbersAround - numbers) < 0.7) {

                    result = Math.floor(numbers);
                    sliceString.append(String.valueOf(numbers));

                }
                if (Math.abs(numbersAround - numbers) > 0.7) {

                    result = Math.floor(numbers);
                    sliceString.append(String.valueOf(result));

                }

            }
            catch (Exception e){
                resultBoolean=false;
                System.out.print(diagonals[i].substring(1, 4) + ", ");
                sliceString.append(diagonals[i].substring(1, 4)+",");

            }
            resultBoolean=true;
        }
        return sliceString;
    }
}

