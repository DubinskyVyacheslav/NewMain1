package homework11;

import java.util.Random;

public class Constant {

    String[] name = new String[]{"AMD","Intel"};
    Random random = new Random();

    public String getName() {
        return name[random.nextInt(2)];
    }
}
