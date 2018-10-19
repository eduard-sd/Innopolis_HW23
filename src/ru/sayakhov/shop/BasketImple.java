package ru.sayakhov.shop;

import java.util.ArrayList;
import java.util.List;

public class BasketImple implements Basket {
    private ArrayList<String> basketName = new ArrayList<>(); // список обьектов в корзине
    private ArrayList<Integer> basketQuantity = new ArrayList<>(); // список обьектов в корзине

    public ArrayList<String> getBasketName() {
        return basketName;
    }

    public ArrayList<Integer> getBasketQuantity() {
        return basketQuantity;
    }

    @Override
    public void addProduct(String product, int quantity) {
        basketName.add(product);
        basketQuantity.add(quantity);
    }

    @Override
    public void removeProduct(String product) {
        if (basketName.contains(product)) {
            int index = basketName.indexOf(product);
            basketName.remove(index);
            basketQuantity.remove(index);
        }

    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if (basketName.contains(product)) {
            int index = basketName.indexOf(product);
            basketQuantity.set(index, quantity);
        }
    }

    @Override
    public void clear() {
        basketName.clear();
        basketQuantity.clear();
    }

    @Override
    public List<String> getProducts() {
        return getBasketName();
    }

    @Override
    public int getProductQuantity(String product) {
        if (!basketName.contains(product)) {
            return 0;
        }
        int index = basketName.indexOf(product);
        return basketQuantity.get(index);
    }
}
