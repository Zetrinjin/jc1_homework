package lesson11;

public abstract class Machine {

    private String brandName;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public abstract void startEngine();//если объявляется метод, то сабклассы должны его реализовать

}
