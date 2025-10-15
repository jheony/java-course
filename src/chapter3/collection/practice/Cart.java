package chapter3.collection.practice;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> cart = new ArrayList<>();

    void addProduct(Product p) {
        cart.add(p);
        System.out.println("장바구니에 " + p.getName() +"를 추가했습니다!");
    }
    void printCart() {
        if(cart.isEmpty()) {
            System.out.println("장바구니 목록이 존재하지 않습니다.");
        } else {
            System.out.print("장바구니 목록: ");
            for(Product p : cart) {
                System.out.print(p.getName()+" ");
            }
            System.out.println();
        }
    }
    void removeProduct(Product p) {
        if(cart.contains(p)){
            System.out.println("장바구니에서 " +p.getName()+"을 삭제했습니다.");
            cart.remove(p);
        }else{
            System.out.println("장바구니에 해당 상품이 존재하지 않습니다.");
        }
    }

    void calculateTotalPrice() {
        int totalPrice = 0;
        for(Product p : cart) {
            totalPrice += p.getPrice();
        }
        System.out.println("총 가격은 " + totalPrice +"입니다.");
    }
}
