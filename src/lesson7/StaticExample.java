package lesson7;

public class StaticExample {
    public static void main(String[] args) {
        SomeValue someValue1 = new SomeValue();
        SomeValue someValue2 = new SomeValue();

        someValue1.i1++;
        someValue1.i2+=3;

        someValue2.i1++;
        someValue2.i2+=5;

        System.out.println("somevalue1 i1 = " + someValue1.i1 + " i2=" +someValue1.i2);
        System.out.println("somevalue1 i1 = " + someValue2.i1 + " i2=" +someValue2.i2);
    }
}

class SomeValue{

    public static final int GLOBAL_CONSTANT = 7;// глобальная константа
    static int i1 = 0;
    int i2 = 0;
}
