package lesson9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateTimeexample {
    public static void main(String[] args) {

        Date currentDate = new Date();//не часто используется
        System.out.println(currentDate);

        java.sql.Date sqlDate = new java.sql.Date(currentDate.getTime());//это используется
        System.out.println(sqlDate);

        java.time.LocalDate.now();//и это используется
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        Calendar cal = Calendar.getInstance();
        System.out.println(cal);


    }
}
