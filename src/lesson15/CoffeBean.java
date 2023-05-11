package lesson15;

import java.awt.*;
import java.io.Serializable;
import java.util.Objects;

public class CoffeBean implements Serializable {

    private String sort;
    private int weight;

    private Color color;
    private String origionFrom;
    private double humidity;
    private boolean isFried;


    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getOrigionFrom() {
        return origionFrom;
    }

    public void setOrigionFrom(String origionFrom) {
        this.origionFrom = origionFrom;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public boolean isFried() {
        return isFried;
    }

    public void setFried(boolean fried) {
        isFried = fried;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CoffeBean coffeBean = (CoffeBean) o;

        if (weight != coffeBean.weight) return false;
        if (Double.compare(coffeBean.humidity, humidity) != 0) return false;
        if (isFried != coffeBean.isFried) return false;
        if (!Objects.equals(sort, coffeBean.sort)) return false;
        if (!Objects.equals(color, coffeBean.color)) return false;
        return Objects.equals(origionFrom, coffeBean.origionFrom);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = sort != null ? sort.hashCode() : 0;
        result = 31 * result + weight;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (origionFrom != null ? origionFrom.hashCode() : 0);
        temp = Double.doubleToLongBits(humidity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isFried ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CoffeBean{" +
                "sort='" + sort + '\'' +
                ", weight=" + weight +
                ", color=" + color +
                ", origionFrom='" + origionFrom + '\'' +
                ", humidity=" + humidity +
                ", isFried=" + isFried +
                '}';
    }
}
