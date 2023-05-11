package lesson15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CoffeBeanWriter {

    public boolean writeToFile(CoffeBean coffeBean, String fileName){
        boolean result;


        try {//если открытие происходит внутри try(тут),то закрывать файлы не надо
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(coffeBean);

            oos.close();
            fos.close();

            result = true;
        } catch (IOException e) {//одинаковый разраяд ошибки
            e.printStackTrace();//распечатать
            result = false;
        }


        return result;
    }
}
