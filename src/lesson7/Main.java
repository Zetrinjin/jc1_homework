package lesson7;
//добавить функционал оплаты деньгами
public class Main {
    public static void main(String[] args) {//объект класса
        Automat automat = new Automat();
        while(true) {
            automat.printMainMenu();
            int productNum = automat.readProductNumber();
            //get product
            automat.takeProduct(productNum);
        }
    }
}
