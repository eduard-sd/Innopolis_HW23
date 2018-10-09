package ru.sayakhov;

import ru.sayakhov.shop.Cart;
import ru.sayakhov.shop.Product;
import ru.sayakhov.shop.Store;

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

        shopStore.addProductInStore(bread);
        shopStore.addProductInStore(milk);
        shopStore.addProductInStore(meet);
        shopStore.addProductInStore(potato);

        shopStore.getProductList();
        System.out.println("Выводим на экран только продукты на складе");
        shopStore.getProducts();
        shopStore.getProductQuantity(milk);

        Cart cart = new Cart();
        System.out.println("Проверяем пустая ли корзина: ");
        cart.updateProductQuantityInCart();
        // добавляем товар
        cart.addProductFromStore(milk,5);
        cart.addProductFromStore(potato,5);
        cart.addProductFromStore(bread,1);
        cart.addProductFromStore(bread,1);
        cart.addProductFromStore(meet,4);
        cart.addProductFromStore(meet,1);

        System.out.println("Проверяем уменьшилось ли на складе количество товарных запасов");
        shopStore.getProductList();
        System.out.println();
        cart.updateProductQuantityInCart();
        cart.getProductQuantityInCard(milk);
        cart.clearCardProductList();
        System.out.println("Cleaning cart");
        cart.updateProductQuantityInCart();
    }
}
