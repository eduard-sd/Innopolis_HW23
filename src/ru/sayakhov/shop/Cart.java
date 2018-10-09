package ru.sayakhov.shop;

import java.util.ArrayList;

public class Cart extends Store {
    private ArrayList<Product> cart = new ArrayList<Product>();
    private ArrayList<Integer> quantityProductList = new ArrayList<Integer>();


    public void updateProductQuantityInCart() { //Посмотреть список всех товаров в корзине
        System.out.println("Products Cart Full List : ");
        for ( int i = 0; i < cart.size(); i++ ) {
            System.out.println(cart.get(i).getName() + " : " + quantityProductList.get(i));
        }
    }

    public void addProductFromStore(Product product, int quantity) { // Добавить товар и колличество в корзину
        if (cart.indexOf(product) != -1) { // если продукт уже есть в корзине
            int index = cart.indexOf(product);
            quantityProductList.set(index, quantityProductList.get(index) + quantity);
            minusProductQuantity(product, quantity);
        } else {
            cart.add(product);
            quantityProductList.add(quantity);
            minusProductQuantity(product, quantity);
        }
    }

    public void removeProductInCart(Product product, int quantity) {  // Удалить товар из корзины
        if (quantityProductList.get(cart.indexOf(product)) >= 1 ) { // если количество продукта в корзине больше
            if (quantity > quantityProductList.get(cart.indexOf(product)) ) {
                System.out.println("Невозможно удалить больше чем есть в корзине");
            }else {
                int index = cart.indexOf(product);
                quantityProductList.set(index, quantityProductList.get(index) - quantity);
                plusProductQuantity(product, quantity);
            }
        } else {
            int index = cart.indexOf(product);
            cart.remove(product);
            quantityProductList.remove(index);
            plusProductQuantity(product, quantity);
        }
    }


    public void clearCardProductList() {  // Очистить козину и добавить все на склад
        for ( int i = cart.size()-1; i > -1 ; i-- ) {
            cart.remove(i);
            quantityProductList.remove(i);
        }
    }

    public int getProductQuantityInCard(Product name) {  // По имени получить колличество товаров
        int index = cart.indexOf(name);
        System.out.print(name.getName() + " Store Quantity : ");
        System.out.println(quantityProductList.get(index));
        return quantityProductList.get(index);
    }

}
