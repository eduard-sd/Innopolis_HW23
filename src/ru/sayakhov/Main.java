package ru.sayakhov;
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

        Store shopStore = new Store();

        shopStore.productList.add(bread);
        shopStore.productList.add(milk);
        shopStore.productList.add(meet);
        shopStore.productList.add(potato);

        shopStore.getProductList();

    }
}
