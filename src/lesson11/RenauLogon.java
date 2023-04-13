package lesson11;

public class RenauLogon  extends Machine implements CarDriving {
    private int milage;

    public RenauLogon() {
        setBrandName("renaulogon");
    }

    @Override
    public void startEngine() {
        System.out.println(getBrandName() + " start engine");
    }

    public int drive(int km){
        milage += km;
        System.out.println( getBrandName() + " drive distance:" + km + " total: " + milage);
        return milage;
    }
}
