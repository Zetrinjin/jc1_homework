package lesson15.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CoffeBeanReader {
    public Object readFromFile(String fileName){

        try {
            File file = new File(fileName);
            if(!file.exists()){
                return null;
            }

            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Object obj = ois.readObject();
            return obj;


        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
}
