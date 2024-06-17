package homework6;

import java.util.Arrays;

public class Start {

    String [][] finalRobotOutput;

    public String[][] createRobot() {

        FactoryHead robotHead = new FactoryHead();
        FactoryBody robotBody = new FactoryBody();
        String[][] finalRobot = robotBody.makeBody(robotHead.makeDetail());
        this.finalRobotOutput = finalRobot;

        return finalRobot;
    }

//    @Override
//    public String toString() {
//
//        return Arrays.deepToString(finalRobotOutput);
//    }
}
