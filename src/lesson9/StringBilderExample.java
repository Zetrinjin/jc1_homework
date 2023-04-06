package lesson9;

public class StringBilderExample {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("test");
        StringBuilder sb2 = new StringBuilder("test");

        System.out.println(sb1.compareTo(sb2));//сравниваем строки

        sb2.append("12345");
        System.out.println(sb1.compareTo(sb2));
    }
}
