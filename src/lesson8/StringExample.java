package lesson8;

public class StringExample {
    public static void main(String[] args) {

        String s1 = "s1";//указываем константу
        String s2 = new String(new char[]{'s','2'});//создание объекта
        String s3 = "s2";
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        char[] ch2 =s2.toCharArray();

        System.out.println(s3.concat(s2));
    }

}
