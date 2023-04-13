package lesson11;

public class Bmw  extends Machine implements CarDriving{

    public Bmw(){
        this("bmw");
    }

    public Bmw(String brand){
        setBrandName(brand);
    }

    @Override
    public void startEngine() {//можно делать так если несколько реализаций
        startEngine("",0,false);
    }
//method overload
    public void startEngine(String key){
        startEngine(key,0,false);
    }

    public void startEngine(String key,int delay,boolean remote) {
        System.out.println(getBrandName() + " start engine");
        if (key != null && !key.equals("")) {
            System.out.println("wih " + key);
        }


        if (delay != 0) {
            System.out.println(" delay " + delay);
        }

        if (remote) {
            System.out.println(" remoutly");
        }
    }

    @Override
    public int drive(int distance) {
        System.out.println(getBrandName() + " ");
        return 0;
    }
}
