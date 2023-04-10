package lesson10;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1,2,3};
        boolean isObject ;
        isObject =numbers instanceof Object;//проверка на то явля ли намберс объектом
        System.out.println("array is object:" + isObject);

        String[] string = {"s1","s2","s3"};
        isObject = string instanceof Object;//проверка на то является ли стринг объектом
        System.out.println("string array is object: " + isObject);

        PizzaOrderStatus status = PizzaOrderStatus.NewOrder;
        status.setProgress(Progress.START);
        System.out.println(status +" :" +status.ordinal() + "progress: " + status.getProgress());
        status.setProgress(Progress.FINISH);
        System.out.println(status +" :" +status.ordinal() + "progress: " + status.getProgress());

        status = PizzaOrderStatus.Delivery;
        System.out.println(status +" : " +status.ordinal() + " time:" + status.getMaxExecutionTime());

        isObject = status instanceof Object;
        System.out.println("is enum object: " + isObject);//enum является Object

        Pizza pizza = new Pizza();
        //pizza.notify();
        System.out.println(pizza.getClass().getName());
        pizza.setName("margarita");
        System.out.println(pizza.getName());
    }
}
