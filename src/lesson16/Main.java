package lesson16;

public class Main {
    public static void main(String[] args) {

        //поток создается двумя способами
        //1)thread а 2) runnable
        System.out.println("My current thread:" + Thread.currentThread().getName());//

        HelloThread helloThread = new HelloThread("Hello");
        System.out.println("state of helloworld:" +helloThread.getState());
        helloThread.run();//зашел в метод
        helloThread.start();//запуск потока но как другой поток, тк сам создал свой run
        System.out.println("state of helloworld:" +helloThread.getState());

        new HelloThread("hello2").start();

    }
    static class HelloThread extends Thread{

        public HelloThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println("My current thread:" + Thread.currentThread().getName());
        }
    }
}
