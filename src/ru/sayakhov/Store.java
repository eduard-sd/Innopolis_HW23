package ru.sayakhov;

import java.util.ArrayList;
import java.util.List;

public class Store {
    ArrayList<Product> productList = new ArrayList<Product>();

    public Store() {
    }

    public ArrayList<Product> getProductList() { //Посмотреть список всех товаров на складе
        System.out.println("Product Store List : ");
        for ( int i = 0; i < productList.size(); i++ ) {
            System.out.println(productList.get(i).getName() + " : " + productList.get(i).getQuantity());
        }
        return productList;
    }

    public List<Product> getProducts() {  // Получить список всех товаров без количества
        System.out.println("Product Store List : ");
        for ( int i = 0; i < productList.size(); i++ ) {
            System.out.println(productList.get(i).getName());
        }
        return productList;
    }

    public int getProductQuantity(Product name) {  // По имени получить колличество товаров
        System.out.println("Product Store List : ");
        System.out.println(productList.get(name));

        return productList;
    }
    // удалить товар со склада

}
