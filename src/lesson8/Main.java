package lesson8;

public class Main {
    public static void main(String[] args) {
        ImmutableMan man =new ImmutableMan("Dania",100,
                new MutableAddress("Minsk","lenina 1"));
        ImmutableMan man2 =new ImmutableMan("Lina",58,
                new MutableAddress("Leningrad", "stoi 5"));

        System.out.println(man.getName() + " " +man.getHairLenght() + " " + man.getAddress());

        man.getAddress().setCity("lenin");
        man.getAddress().setStreet("Stroi 5");

        System.out.println(man.getName() + " " +man.getHairLenght() + " " + man.getAddress());

        //man.getHairLenght() = 10;//не можем сделать тк залочено
        //мы вообще ничего не сможем поменять тк там все immutable
    }
}
