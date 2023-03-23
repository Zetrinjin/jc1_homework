package lesson5;

public class MathExample {
    public static void main(String[] args) {

        System.out.println(2+2);
        System.out.println("2" + "2");
        System.out.println(5-3);
        System.out.println("5" + "3");
        System.out.println(4*5);
        System.out.println('4' * '5');// в кодовом формате перемножили
        System.out.println(0x34 * 0x35);//тоже что и сверху только самим кодом
        System.out.println(0b100 * 0b101);//двоичная система
        System.out.println(Integer.toOctalString(02 + 017));//восьмеричная система

        System.out.println((float) 3/2);
        System.out.println(7%5);

        int i = 0;
        System.out.println(i++);//0
        System.out.println(++i);//2
        System.out.println(Math.pow(2,3));



    }
}
