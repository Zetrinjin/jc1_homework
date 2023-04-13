package lesson11;

public class Vwpolo  extends Machine implements CarDriving {
    private int kilometers;



    public Vwpolo() {
        setBrandName("vwpolo");
    }

    @Override
    public void startEngine() {
        System.out.println(getBrandName() + " start engine");
    }

    public int drive(int kilomiter){
        kilometers += kilomiter;
        System.out.println( getBrandName() +  " drive distance:" + kilomiter + " total: " + kilometers);
        return kilometers;
    }

}
