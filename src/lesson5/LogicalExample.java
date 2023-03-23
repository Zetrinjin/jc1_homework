package lesson5;

public class LogicalExample {
    public static void main(String[] args) {

        int i1 = 0, i2 = 1;

        boolean res1 = i1 != 0 | i2>0;
        System.out.println(res1);

        boolean res2 = i1 != 0 || i2>0;
        System.out.println(res2);

        boolean res3 = i1 == 0 | compare(i2, 0);
        System.out.println(res3);

        boolean res4 = i1 == 0 || compare(i2, 0);//вторая часть не проверяется
        System.out.println(res4);
    }

    static boolean compare(int a, int b)
    {
        System.out.println("compare");
        return a>b;
    }
}
