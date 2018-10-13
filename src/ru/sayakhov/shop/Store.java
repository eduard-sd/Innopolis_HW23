package ru.sayakhov.shop;

import java.util.ArrayList;
import java.util.List;

public class Store implements PlusMinus {
    private ArrayList<Product> productList = new ArrayList<>(); //склад
    public Store() {
    }

    public void addProductInStore(Product product) {
        productList.add(product);
    } // Добавление продукта на склад

    public ArrayList<Product> getProductList() {
        System.out.println("Products Store Full List : ");
        for ( int i = 0; i < productList.size(); i++ ) {
            System.out.println(productList.get(i).getName() + " : " + productList.get(i).getQuantity());
        }
        return productList;
    } //Посмотреть список всех товаров на складе с количеством в штуках

    public List<Product> getProducts() {
        System.out.print("Products Store List : ");
        for ( int i = 0; i < productList.size(); i++ ) {
            if (i < productList.size()-1) {
                System.out.print(productList.get(i).getName() + ", ");
            }else{
                System.out.println(productList.get(i).getName() + ".");
            }
        }
        return productList;
    } // Получить список всех товаров без количества в  шт

    public int getProductQuantity(Product name) {
        System.out.print(name.getName() + " Store Quantity : ");
        System.out.println(name.getQuantity());
        return name.getQuantity();
    }  // Получить по имени колличество товаров

    public int plusProductQuantity(Product name, int quantity) {
        int result = name.setQuantity(name.getQuantity() + quantity);
        return result;
    } // Установист новое значение колличетсва на складе

    public int minusProductQuantity(Product name, int quantity) {
        int result = name.setQuantity(name.getQuantity() - quantity);
        return result;
    } // Установить новое значение колличетсва на складе

}
