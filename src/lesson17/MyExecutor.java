package lesson17;

import java.util.Date;
import java.util.concurrent.*;

public class MyExecutor {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        String s="hello from thread ";
        System.out.println(s+ Thread.currentThread().getName());
        ExecutorService executorService = Executors.newFixedThreadPool(10);



       /* executorService.submit(new CurrentDataPrinter());
        final Future<Date> future = executorService.submit(new CurrentDataPrinter());*/
        final Future<Date> future2 = executorService.submit(()->{
            Date date =new Date();
            System.out.println(date);
            System.out.println(s+ Thread.currentThread().getName());//будет другой поток
            return date;
        });//лямбда выражение

       /* if(future.isDone()){
            Date dateFromFuture = future.get();
            System.out.println("date from future: " + dateFromFuture);
        }*/


        executorService.shutdown();

        /*for(int i =0;i<10;i++){
            executorService.execute(()->{

            });
        }*/
    }

  /*  static class CurrentDataPrinter implements Callable<Date> {
        @Override
        public Date call() throws Exception {
            Date date =new Date();
            System.out.println(date);
            System.out.println(Thread.currentThread().getName());
            return date;
        }
    }*/
}
