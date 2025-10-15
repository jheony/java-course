package chapter3.collection.practice;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product apple = new Product("사과", 3000);
        Product onion = new Product("양파", 2000);
        Product fish = new Product("생선", 10000);
        Product tofu = new Product("두부", 1500);

        Cart cart = new Cart();
        cart.addProduct(apple);
        cart.addProduct(onion);
        cart.addProduct(fish);
        cart.addProduct(tofu);

        cart.printCart();

        cart.removeProduct(apple);

        cart.calculateTotalPrice();
    }
}
