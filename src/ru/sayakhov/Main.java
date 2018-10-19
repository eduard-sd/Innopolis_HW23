package ru.sayakhov;

import ru.sayakhov.shop.BasketImple;
import ru.sayakhov.shop.Product;

/**
 *
 * Реализовать класс корзины интернет магазина по следующему интерфейсу:
 *
 * interface Basket {
 *
 *     void addProduct(String product, int quantity);
 *
 *     void removeProduct(String product);
 *
 *     void updateProductQuantity(String product, int quantity);
 *
 *     void clear();
 *
 *     List<String> getProducts();
 *
 *     int getProductQuantity(String product);
 *
 * }
 * */
public class Main {

    public static void main(String[] args) {
        Product bread = new Product("Bread", 10);
        Product milk = new Product("Milk",101);
        Product meet = new Product("Meet", 20);
        Product potato = new Product("Potato", 30);

        BasketImple basketImple = new BasketImple();
        basketImple.addProduct("Milk",10);
        basketImple.addProduct("Bread",20);
        basketImple.addProduct("Potato",30);

        basketImple.removeProduct("Milk");

        basketImple.updateProductQuantity("Bread",50);

        System.out.println(basketImple.getProducts());

        System.out.println(basketImple.getProductQuantity("Bread"));

        basketImple.clear();

        basketImple.getProducts();




    }
}
