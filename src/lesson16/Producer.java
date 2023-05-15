package lesson16;

public class Producer  extends  Thread{

    @Override
    public void run() {
        WareHouse wareHouse = WareHouse.getInstance();


        for(int i=0;i<10;i++){
            wareHouse.addGood("product" + i);
            try {
                Thread.sleep(2000);//тут милисекунды потому и 5000
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
