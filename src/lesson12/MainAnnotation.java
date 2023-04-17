package lesson12;

import java.util.Date;

public class MainAnnotation {


    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date.getHours());

        MyAnnotatedClass myAnnotatedClass = new MyAnnotatedClass();
        System.out.println(myAnnotatedClass);
        final MyHelloWorldAnnotation annotation =
                myAnnotatedClass.getClass().getAnnotation(MyHelloWorldAnnotation.class);
        for (int i = 0; i < annotation.count(); i++) {
            System.out.println(annotation.message());
        }
    }
}

@MyHelloWorldAnnotation(message = "Hello World", count = 5)
class MyAnnotatedClass {

}
