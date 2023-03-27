package lesson5;

public class Switchexample {
    public static void main(String[] args) {

        String command;

        if (args.length !=1){
            command = "";
        }else{
            command = args[0];
        }

        switch (command) {
            case "start": {
                System.out.println("starting");
                break;
            }
            case "stop": {
                System.out.println("stopping");
                break;
            }
            case "pause": {
                System.out.println("pausing");
                break;
            }
            default: {
                System.out.println("usage java");
                System.out.println("command: start, stop or pause");
                System.exit(1);// для отрицательного завершения
            }
        }
        System.exit(0);// для положительного завершения
    }
}
