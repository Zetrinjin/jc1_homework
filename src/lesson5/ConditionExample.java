package lesson5;

public class ConditionExample {
    public static void main(String[] args) {
        boolean y = false;
        int x = 96;
        if(x%16 == 0){
            y = true;
        }else{
            y =false;
        }
        System.out.println(y);

    }


    public static void summa(String[] args){
        int x= 5, y =7;

        if(x == 5){
            y= 9;

        }else if(y == 9){
            x= 3;

        }
        System.out.println(x);
        System.out.println(y);

    }
}
