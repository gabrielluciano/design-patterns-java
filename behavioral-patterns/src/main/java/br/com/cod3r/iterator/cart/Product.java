package br.com.cod3r.iterator.cart;

public class Product {
    private final String desc;
    private final Double value;

    public Product(String desc, Double value) {
        this.desc = desc;
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Product{" +
                "desc='" + desc + '\'' +
                ", value=" + value +
                '}';
    }
}
