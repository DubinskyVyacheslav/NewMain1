package homework10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.UUID;

public final class Order {

    Properties myProperties = new Properties();
    Date date = new Date();

    public  void deleteOrder(int key) {
        setMyPropertiesLoad(getFileInputStream());
        myProperties.setProperty(String.valueOf(key + 2), String.valueOf(key) + ". delete order");
        setMyPropertiesStore(getFileOutputStream());
        System.out.println("Изменнёный список");
        for (int i = 1; i <= myProperties.size(); i++) {
            System.out.println(myProperties.getProperty(String.valueOf(i)));
        }
        System.out.println();
    }

    public void addOrder(String nameProduct) {
        setMyPropertiesLoad(getFileInputStream());
        myProperties.setProperty(String.valueOf(myProperties.size() + 1), String.valueOf(myProperties.size() - 1) + "." + nameProduct + "(" + UUID.randomUUID().toString() + "," + String.valueOf(date) + ")");
        setMyPropertiesStore(getFileOutputStream());
        for (int i = 1; i <= myProperties.size(); i++) {
            System.out.println(myProperties.getProperty(String.valueOf(i)));
        }
        System.out.println();
    }

    public void setMyPropertiesLoad(FileInputStream myFile) {
        try {
            this.myProperties.load(myFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setMyPropertiesStore(FileOutputStream myOutputStreamFile) {
        try {
            myProperties.store(myOutputStreamFile, "");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public FileInputStream getFileInputStream() {
        FileInputStream myFile;
        try {
            myFile = new FileInputStream("src/resources/MyOrders.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return myFile;
    }

    public FileOutputStream getFileOutputStream() {

        FileOutputStream myFile;
        try {
            myFile = new FileOutputStream("src/resources/MyOrders.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return myFile;
    }

    public void printProperties() {
        setMyPropertiesLoad(getFileInputStream());
        for (int i = 1; i <= myProperties.size(); i++) {
            System.out.println(myProperties.getProperty(String.valueOf(i)));
        }
        System.out.println();

    }

}
