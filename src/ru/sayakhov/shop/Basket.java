package ru.sayakhov.shop;

import java.util.List;

public interface Basket {
    void addProductFromStore(Product product, int quantity);

    void removeProductInCart(Product product, int quantity);

    void updateProductQuantityInCart(Product product, int quantity);

    void clearCardProductList();

    List<Product> getProductsInCart();

    void getProductQuantityInCart(Product name);
}
