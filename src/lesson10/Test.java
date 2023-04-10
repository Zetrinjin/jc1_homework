package lesson10;

public class Test {    //просто пример задачи
    public static double getMiddle(int[] numbers){
        if(numbers ==null || numbers.length == 0){
            return 0;
        }
        double result;
        int sum =0;
        for(int i=0;i<numbers.length;i++){
            sum +=numbers[i];
        }
        result = (double) sum/numbers.length;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new int[]{1,2});

        int[] array = null;
        System.out.println(getMiddle(array));
    }
}
