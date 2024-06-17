package homework6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class FactoryBody {

    Body[] bodyEnum = Body.values();
    Random random = new Random();

    public String[][] makeBody(String[][] finalRobot) {

        for (int i = 0; i < 9; i++) {

            finalRobot[i][1] = String.valueOf(bodyEnum[random.nextInt(3)]);

        }

        return finalRobot;
    }
}
