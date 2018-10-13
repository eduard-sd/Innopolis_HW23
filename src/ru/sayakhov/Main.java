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
        shopStore.addProductInStore(bread); //добавление товара
        shopStore.addProductInStore(milk);
        shopStore.addProductInStore(meet);
        shopStore.addProductInStore(potato);

        shopStore.getProductList(); // получение списка товара
        System.out.println();
        System.out.println("Выводим на экран только продукты на складе");
        shopStore.getProducts();
        shopStore.getProductQuantity(milk);

        Cart cart = new Cart();
        System.out.println();
        System.out.println("Проверяем пустая ли корзина: ");
        cart.getProductsInCart(); // обновление товара в корзине
        // добавляем товар
        cart.addProductFromStore(milk,5);
        cart.addProductFromStore(potato,5);
        cart.addProductFromStore(bread,1);
        cart.addProductFromStore(bread,1);
        cart.addProductFromStore(meet,4);
        cart.addProductFromStore(meet,1);

        System.out.println("Проверяем уменьшилось ли на складе количество товарных запасов");
        shopStore.getProductList(); // обновление товара на складе
        System.out.println();
        cart.getProductsInCart();
        System.out.println();
        cart.getProductQuantityInCart(milk); // получение количества товара по имени
        cart.removeProductInCart(milk,6); // удаление из корзины большего количества чем есть
        System.out.println("==========================================");
        cart.getProductQuantityInCart(milk); // получение количества товара по имени
        cart.removeProductInCart(milk,4); // удаление из корзины
        cart.getProductQuantityInCart(milk); // получение количества товара по имени
        cart.removeProductInCart(milk,1); // удаление из корзины
        cart.getProductQuantityInCart(milk); // получение количества товара по имени
        cart.updateProductQuantityInCart(milk,10);
        cart.getProductQuantityInCart(milk); // получение количества товара по имени
        cart.clearCardProductList();// очищение корзины
        System.out.println("Cleaning cart");
        cart.getProductsInCart();

    }
}
