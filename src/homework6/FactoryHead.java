package homework6;

import java.util.Random;

public class FactoryHead implements RobotFactory {

    Head[] headsEnum = Head.values();
    Random random = new Random();
    @Override
    public String[][] makeDetail() {

        String[][] robot = new String[9][2];

        for (int i = 0; i < 9; i++) {

            robot[i][0] =String.valueOf(headsEnum[random.nextInt(3)]);

        }
        return robot;
    }
}
