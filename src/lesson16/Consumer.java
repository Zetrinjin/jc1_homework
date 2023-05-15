package lesson16;

public class Consumer extends Thread{

    public Consumer(){
        super("consumer");
    }
    @Override
    public void run() {
        WareHouse wareHouse = WareHouse.getInstance();




        while (true) {
            wareHouse.takeGood();
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
