package lesson9;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public final static String ALL_CYRILLIC_STRINGS = "[\\u0410-\\u044F\\u0451\\u0401]+";
    public static void main(String[] args) {



        System.out.println("test23test 463 tesoks\\c232".matches("\\D{4}"));//точное сравнение на совпадение
        System.out.println("375291010111".matches("\\d{12}"));//точное сравнение

        String[] strings = "i love java. and i love beer".split("love");// разделяет запятой то что мы заменяем
        System.out.println(strings);//будет выводить хэш код
        System.out.println(Arrays.toString(strings));//выведет то что нужно

        Pattern pattern = Pattern.compile(ALL_CYRILLIC_STRINGS);
        String text = "я люблю футбол";
        final Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(text.substring(start,end));
        }
    }
}
