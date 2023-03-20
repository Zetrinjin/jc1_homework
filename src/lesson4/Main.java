package lesson4;

public class Main {
    public static void main(String[] args) {
        Man man1, man2;
        man1 = new Man();
        man2 = new Man();

        System.out.println("man1 " + man1.hairLenght);

        man2.grow();
        System.out.println("man2 " + man2.hairLenght);
        man2.grow();
        System.out.println("man2 " + man2.hairLenght);
    }
}
