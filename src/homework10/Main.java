package homework10;

public class Main {
    public static void main(String[] args) {

        Constant constant = new Constant();
        constant.welcome();
        CommandCenter commandCenter = new CommandCenter();
        int i = 1;
        while (true) {
            if (i == 1) {
                i = commandCenter.start();
            } else if (i == 0) {
                System.out.println("Остановка программы");
                break;
            }
        }
    }
}

//        Properties myProperties = new Properties();
//        myProperties.setProperty("one", "qwerfghjkjhgfds");
//        System.out.println(myProperties.getProperty("Один"));
//        FileOutputStream out = new FileOutputStream("src/resources/MyProperties.properties");
//        myProperties.store(out,"Product");
//        myProperties.setProperty("one","");
//        System.out.println(myProperties.getProperty("one"));

//        FileInputStream inFile = new FileInputStream("src/resources/MyProperties.properties");
//        myProperties.load(inFile);
//        myProperties.setProperty("5","delete product");
//        FileOutputStream out = new FileOutputStream("src/resources/MyProperties.properties");
//        myProperties.store(out,"");
//        for (int i = 1; i <= myProperties.size(); i++) {
//            System.out.println(myProperties.getProperty(String.valueOf(i)));
//        }
//        myProperties.store(out,"Product");