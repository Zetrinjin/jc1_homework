package lesson16;

import java.util.ArrayList;
import java.util.List;

public class WareHouse {

    private static WareHouse wareHouse = new WareHouse();// синглтон

    public static WareHouse getInstance(){

        return wareHouse;
    }

    private WareHouse(){};
    private List<String> goods = new ArrayList<String>();

    public synchronized void addGood(String s){

        //synchronized (goods) {//поставь лок на goods(залочил на себя)
            while (goods.size() >= 5) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            notifyAll();
            goods.add(s);
            System.out.println(Thread.currentThread().getName() + " adds " + s + "[" + goods.size() + "]");

       // }

    }
    public synchronized String takeGood() {

       // synchronized (goods) {
            while (goods.size() == 0) {
               try {
                   wait();
               }catch (InterruptedException e){
                   e.printStackTrace();
               }

            }

            notifyAll();
            String s = goods.remove(0);
            System.out.println(Thread.currentThread().getName() + " takes " + s +"[" + goods.size() + "]");
            return s;
       // }
    }

}
