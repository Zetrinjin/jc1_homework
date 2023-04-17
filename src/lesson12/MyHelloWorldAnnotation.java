package lesson12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MyHelloWorldAnnotation {

    //не может использ обычные методы
    String message();//может использ абстрактные методы

    int count();

}
