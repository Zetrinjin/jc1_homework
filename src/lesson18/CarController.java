package lesson18;

import java.io.*;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class CarController {

    public List<CarValueObject> readFromFile(File file) throws IOException {

        /*Properties properties =new Properties();
        properties.load(new FileInputStream(file));*/

         new BufferedReader(new FileReader(file))
                .lines()
                 .map(s->s.split(","))
                 .map(ars->new CarValueObject(
                         ars[0],
                         CarColor.BLUE,
                         BodyType.COUPE,
                         Short.parseShort(ars[3]),
                         Integer.parseInt(ars[4]),
                         ars[5],
                         Byte.parseByte(ars[6]),
                         new BigDecimal(ars[7])
                 ))
                 .forEach(System.out::println);

         return null;

    }

    public static void main(String[] args) {

        try {
            CarController controller = new CarController();
            controller.readFromFile(new File("c:/repo/resourses/bmw_car.csv"));
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

}
