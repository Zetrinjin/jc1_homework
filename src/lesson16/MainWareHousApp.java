package lesson16;

public class MainWareHousApp {

    public static void main(String[] args) {

        new Producer().start();
        new Consumer().start();
    }
}
