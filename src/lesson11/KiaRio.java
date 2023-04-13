package lesson11;

public class KiaRio  extends Machine implements CarDriving{
    private int km;

    public KiaRio() {
        setBrandName("kiario");
    }

    @Override
    public void startEngine() {
        System.out.println(getBrandName() + " start engine");
    }

    public int drive(int distance){
        km += distance;
        System.out.println(getBrandName() +" drive distance:" + distance + " total: " + km);
        return km;
    }


}
