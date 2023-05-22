package lesson17;

import java.util.Random;
import java.util.concurrent.Callable;

public class MyLambda {
    public static void main(String[] args) throws Exception {

        //Callable<Double> doubleCallable = () -> 123.45;//для создания лямбда выражения. (){ return 123.45; } один и тот же метод

        //doCalculation(doubleCallable);
       /* Double callResult = doubleCallable.call();
        System.out.println(callResult);*/

        doCalculation(() -> 123.45);
        doCalculation(() -> new Random().nextDouble());
        doCalculation(new MyLambda()::myMethod);
        doCalculation(MyLambda::myStaticMethod);
    }

    Double myMethod(){ return 123.45; }
    static Double myStaticMethod(){ return 43.21; }

    public static void doCalculation(Callable<Double> doubleCallable) throws Exception {
        Double result = doubleCallable.call();
        System.out.println(result);
    }
}
