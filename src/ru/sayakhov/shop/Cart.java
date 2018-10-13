package ru.sayakhov.shop;

import java.util.ArrayList;
import java.util.List;

public class Cart implements Basket,PlusMinus{
    private ArrayList<Product> cart = new ArrayList<Product>(); // список обьектов в корзине
    private ArrayList<Integer> quantityProductList = new ArrayList<Integer>(); // Integer список количества товаров

    @Override
    public List<Product> getProductsInCart() {
        System.out.println("Products Cart Full List : ");
        for ( int i = 0; i < cart.size(); i++ ) {
            System.out.println(cart.get(i).getName() + " : " + quantityProductList.get(i));
        }
        return cart;
    } //Посмотреть список всех товаров в корзине

@Override
    public void addProductFromStore(Product product, int quantity) {
        if (cart.indexOf(product) != -1) { // проверяем если продукт уже есть в корзине
            int index = cart.indexOf(product);
            quantityProductList.set(index, quantityProductList.get(index) + quantity);
            minusProductQuantity(product, quantity); // запускаем метод удаления со склада
        } else { // если продукт новый и его нет в корзине
            cart.add(product);
            quantityProductList.add(quantity);
            minusProductQuantity(product, quantity); // запускаем метод удаления со склада
        }
    } // Добавить со склада товар и колличество в корзину

    @Override
    public void removeProductInCart(Product product, int quantity) {
        if (quantityProductList.get(cart.indexOf(product)) > 1 ) { // сколько товара в корзине
            if (quantity > quantityProductList.get(cart.indexOf(product)) ) { // если количество удаляемого продукта больше чем есть в корзине
                System.out.println("Невозможно удалить больше чем есть в корзине");
            }else { // убираем из корзины
                int index = cart.indexOf(product);
                quantityProductList.set(index, quantityProductList.get(index) - quantity);
                plusProductQuantity(product, quantity);
            }
        } else { //если колличество товара = 1 то удаляем товар из корзины
            if (quantity > quantityProductList.get(cart.indexOf(product)) ) { // если количество удаляемого продукта больше чем есть в корзине
                System.out.println("Невозможно удалить больше чем есть в корзине");
            }else { // убираем из корзины продукт
                int index = cart.indexOf(product);
                cart.remove(product);
                quantityProductList.remove(index);
                plusProductQuantity(product, quantity);
            }
        }
    } // Удалить товар из корзины

    @Override
    public void clearCardProductList() {
        for ( int i = cart.size()-1; i > -1 ; i-- ) {
            cart.remove(i);
            quantityProductList.remove(i);
        }
    }// Очистить корзину и добавить все на склад

    @Override
    public void getProductQuantityInCart(Product name) {
        if (cart.indexOf(name) >= 0) { // если продукт есть в корзине
            int index = cart.indexOf(name);
            System.out.print(name.getName() + " Store Quantity : ");
            System.out.println(quantityProductList.get(index));
            //return quantityProductList.get(index);
        }else {
            System.out.println("Товара "+name.getName()+" в корзине нет");
        }
    } // По имени получить колличество товаров

    @Override
    public void updateProductQuantityInCart(Product product, int quantity){
        if (cart.indexOf(product) != -1) { // проверяем если продукт уже есть в корзине
            int index = cart.indexOf(product);
            quantityProductList.set(index, quantity);
            minusProductQuantity(product, quantity); // запускаем метод удаления со склада
        } else { // если продукт новый и его нет в корзине
            cart.add(product);
            quantityProductList.add(quantity);
            minusProductQuantity(product, quantity); // запускаем метод удаления со склада
        }

    }

    @Override
    public int plusProductQuantity(Product name, int quantity) {
        return 0;
    }

    @Override
    public int minusProductQuantity(Product name, int quantity) {
        return 0;
    }
}
