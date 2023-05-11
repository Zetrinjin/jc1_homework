package lesson15.reader;

import java.io.File;
import java.util.Map;
import java.util.Properties;

public class Main2 {
    public static void main(String[] args) {

        final Map properties = System.getProperties();//показывает полный путь
        for (Object key: properties.keySet()){
            System.out.println(key + "=" + properties.get(key));
        }

        String sourceFileName = System.getenv("user.home") + File.separator + "coffe_bean.dat";
        System.out.println("read from " +sourceFileName);
        Object obj = new CoffeBeanReader().readFromFile("coffe_bean.dat");
        System.out.println(obj);
    }
}
