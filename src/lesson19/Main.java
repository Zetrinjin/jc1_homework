package lesson19;

public class Main {
    public static void main(String[] args) {


        try{

            new ConsoleWriter().run();
            System.exit(1);
        }catch (Exception e){
            e.printStackTrace();
            System.exit(0);
        }
    }
}
