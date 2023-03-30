package lesson7;

import java.util.Scanner;

public class Automat {

    final Product[] products = {
            new Product("Lays",5),
            new Product("Snickers",3),
            new Product("Bonaqua",7),
            new Product("Oreo",4),
            new Product("Orbit",6),

    };
    public void printMainMenu(){

        int num = 1;
        for(Product product:products){
            if (product.count>0) {
                System.out.println(" " + num + ":" + product.name + "[" + product.count + "]");
            }
            num++;

        }
        System.out.println("please select product number:");
    }
    public int readProductNumber(){
        Scanner scanner = new Scanner(System.in);
        boolean isNumberCorrect;
        int num;
        do {
            num = scanner.nextInt();
            isNumberCorrect = num >= 1 && num <= products.length;
            if(isNumberCorrect){//проеверка для количества продуктов
                Product product = products[num-1];
                isNumberCorrect =product.count>0;
            }
            if (!isNumberCorrect) {
                System.out.println("No such product number:");
                System.out.println("Please select product number:");

            }
        }while(!isNumberCorrect);

        String name =products[num-1].name;
        System.out.println("you selected product " + name);
        return num;
    }

    public void takeProduct(int productNum) {
        Product product=products[productNum - 1];
        product.count--;
        System.out.println("please take product " + product.name + "");
        System.out.println("remain " + product.count + " of " + product.name);//проверка на количество оставшихся продуктов
    }
}
