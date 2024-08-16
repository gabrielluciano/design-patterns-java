package br.com.cod3r.iterator.cart;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Cart implements Iterable<Product> {
    private final List<Product> products;

    public Cart(Product... products) {
        this.products = Arrays.asList(products);
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

    public Stream<Product> stream() {
        return StreamSupport.stream(spliterator(), false);
    }
}
