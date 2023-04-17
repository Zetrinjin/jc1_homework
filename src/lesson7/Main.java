package lesson7;
//добавить функционал оплаты деньгами
public class Main {
    public static void main(String[] args) {//объект класса
        Automat<Product> automat = new Automat<>();
        automat.setProducts(new Product[]{//переделка под дженерики
                    new Product("Lays",5),
                    new Product("Snickers",3),
                    new DrinkProduct("Bonaqua",7,1.5),
                    new Product("Oreo",4),
                    new Product("Orbit",6),
        });
        while(true) {
            automat.printMainMenu();
            int productNum = automat.readProductNumber();
            //get product
            automat.takeProduct(productNum);
        }
    }
}
