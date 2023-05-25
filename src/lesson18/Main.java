package lesson18;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        AverageCalculator calculator = new AverageCalculator();

        List<Integer> testlist1 = List.of(1,2);
        System.out.println(calculator.average(testlist1));

        List<Integer> testlist2 = new ArrayList<Integer>();
        testlist2.add(1);
        testlist2.add(null);
        testlist2.add(2);
        System.out.println(calculator.average(testlist2));

        List<Integer> testlist3 = new ArrayList<Integer>();
        testlist3.add(null);
        testlist3.add(null);
        testlist3.add(null);
        System.out.println(calculator.average(testlist3));

        List<Integer> testlist4 = new ArrayList<Integer>();
        testlist4.add(Integer.MAX_VALUE);
        testlist4.add(Integer.MAX_VALUE);
        testlist4.add(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(calculator.average(testlist4));//должно работать корректно

        List<Integer> testlist5 = new ArrayList<Integer>();
        testlist5.add(1);
        testlist5.add(4);
        testlist5.add(5);
        testlist5.add(8);
        System.out.println(calculator.getMinEvenNumber(testlist5));

    }
}
