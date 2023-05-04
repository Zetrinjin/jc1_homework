package lesson4;
import java.awt.*;

public class Car {
    public Car(int price) {
        System.out.println(price);
    }

    Color color;

    String model;

    public int compareTo(Car car){
        return (color.getRGB() - car.color.getRGB())
                + model.compareTo(car.model);
    }
    public static void main(String[] args) {
        Car bmw,audi;

        bmw = new Car(123_321);
        bmw.color = Color.BLACK;
        bmw.model = "BMW x6";

        Car bmw_second;
        bmw_second = bmw;
        bmw = null;
        System.out.println(bmw_second.model + " " + bmw_second.color);
        //System.out.println(bmw.model + " " + bmw.color);

        audi = new Car(234_432);
        audi.color = Color.ORANGE;
        audi.model = "Audi A8";

    }

    public String getPlateNumber() {
        return "xxx";
    }
}
