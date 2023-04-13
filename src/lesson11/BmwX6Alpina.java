package lesson11;

public class BmwX6Alpina extends Bmw{

    public BmwX6Alpina() {
        super();//обращение к супер конструктору идет на первом месте и нигде больше
        System.out.println("call super");

        System.out.println("Finish constructing");
        //setBrandName("zaporo");//так делать нельзя, ломается наследовательность
    }

    @Override
    public void startEngine(String key) {
        System.out.println("do something");
        super.startEngine(key);
        System.out.println(" engine tuning");
    }
}
