package lesson18;

import java.util.List;
import java.util.Objects;
import java.util.function.ToIntFunction;

//метод сделан так что бы не упасть. мы всегда хотим что бы возвращалось какое то число
public class AverageCalculator {

    public final static Double DEFAULT_AVERAGE = 0.0;
    public Double average(List<Integer> list){
       // ToIntFunction<Integer> toIntFunction = (x)->x.intValue();

        if(list == null || list.isEmpty()){
            //throw new IllegalArgumentException("a list cannot be empty for average calculation");
            return DEFAULT_AVERAGE;
        }

        return list.stream()
                .filter(Objects::nonNull)//проверка на нулл(пропускает объекты)
                .mapToInt(Integer::intValue)
                .average()
                .orElseGet(DEFAULT_AVERAGE::doubleValue);//this.myDouble

    }

    public Double myDouble(){

        return DEFAULT_AVERAGE.doubleValue();
    }

    public Integer getMinEvenNumber(List<Integer> list){//считает мин четное значение

       return  list.stream()
                .filter(Objects::nonNull)//метод референс
                .filter(x->x%2==0)
                .min(Integer::compare)//метод референс
                .orElse(0);
    }



}
