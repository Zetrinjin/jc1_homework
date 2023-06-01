package lesson21;

import com.google.gson.Gson;
import lesson18.BodyType;
import lesson18.CarColor;
import lesson18.CarValueObject;

import java.math.BigDecimal;

public class JsonParserExample {
    public static void main(String[] args) {

        CarValueObject carValueObject =new CarValueObject(
                "bmw", CarColor.BLUE, BodyType.HATCHBACK,(short) 2020, 123456,
                "gaseline",(byte) 4,new BigDecimal(123456)
        );

        Gson gson =new Gson();

        final String s= gson.toJson(carValueObject);
        System.out.println(s);

        final CarValueObject carValueObject2 = gson.fromJson(s, CarValueObject.class);
        System.out.println(carValueObject2);


    }
}
