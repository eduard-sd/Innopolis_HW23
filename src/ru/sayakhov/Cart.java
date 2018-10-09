package ru.sayakhov;

import java.util.ArrayList;
import java.util.List;

public class Cart implements Busket{
    ArrayList <Product> store = new ArrayList<Product>();

    public ArrayList<Product> getProductList() { //Посмотреть список всех товаров в корзине
        return productList;
    }


    @Override
    public void addProduct(String product, int quantity) { // Добавить товар и колличество в корзину
        productList.add()
    }

    @Override
    public void removeProduct(String product, int quantity) {  // Удалить товар из корзины

    }

    @Override
    public void updateProductQuantity(String product, int quantity) {  // Вывести на экран корзину

    }

    @Override
    public void clear() {  // Очистить козину добавить все на склад

    }

}
