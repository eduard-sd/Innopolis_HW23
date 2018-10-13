package ru.sayakhov.shop;

public interface PlusMinus {
    int plusProductQuantity(Product name, int quantity);

    int minusProductQuantity(Product name, int quantity);
}
