package lesson15;

import java.awt.*;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        CoffeBean coffeBean =new CoffeBean();
        coffeBean.setFried(true);
        coffeBean.setColor(Color.BLACK);
        coffeBean.setHumidity(10.0);
        coffeBean.setOrigionFrom("java");
        coffeBean.setSort("arabica");
        coffeBean.setWeight(2);
        System.out.println(coffeBean);

        String destFileName = System.getenv("user.home") + File.separator + "coffe_bean.dat";
        System.out.println("safe to " +destFileName);
        //write object to file
        boolean result = new CoffeBeanWriter().writeToFile(coffeBean, "coffe_bean.dat");
        if(result){
            System.out.println("saved coffe bean to file seccesfully");
        }else{
            System.out.println("not save");
        }

        //read object
    }
}
