package ru.sayakhov.shop;

import ru.sayakhov.shop.Product;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private ArrayList<Product> productList = new ArrayList<>();

    public Store() {
    }

    public void addProductInStore(Product product) {
        productList.add(product);
    }

    public ArrayList<Product> getProductList() { //Посмотреть список всех товаров на складе
        System.out.println("Products Store Full List : ");
        for ( int i = 0; i < productList.size(); i++ ) {
            System.out.println(productList.get(i).getName() + " : " + productList.get(i).getQuantity());
        }
        return productList;
    }

    public List<Product> getProducts() {  // Получить список всех товаров без количества
        System.out.print("Products Store List : ");
        for ( int i = 0; i < productList.size(); i++ ) {
            System.out.print(productList.get(i).getName() + " ");
        }
        System.out.println();
        return productList;
    }

    public int getProductQuantity(Product name) {  // По имени получить колличество товаров
        System.out.print(name.getName() + " Store Quantity : ");
        System.out.println(name.getQuantity());
        return name.getQuantity();
    }

    public int plusProductQuantity(Product name, int quantity) {  // Установист новое значение колличетсва на складе
        int result = name.setQuantity(name.getQuantity() + quantity);
        return result;
    }

    public int minusProductQuantity(Product name, int quantity) {  // Установист новое значение колличетсва на складе
        int result = name.setQuantity(name.getQuantity() - quantity);
        return result;
    }
    // удалить товар со склада
}
