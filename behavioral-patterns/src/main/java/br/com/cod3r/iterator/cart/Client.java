package br.com.cod3r.iterator.cart;

public class Client {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Cart cart = new Cart(new Product("TV", 1000d), new Product("Shoe", 59.99d), new Product("Pencil", 0.5d));

        for (Product p : cart) {
            System.out.println(p);
        }

        Double sum = cart.stream().reduce(0.0,
                (acc, prod) -> acc + prod.getValue(), Double::sum);
        System.out.println(sum);
    }
}
