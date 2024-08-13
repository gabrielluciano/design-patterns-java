package br.com.cod3r.builder.spolleto.functional.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pasta {
    private final List<String> toppings;
    private final List<String> sauces;
    private final Size size;
    private final boolean cheese;
    private final boolean pepper;

    private Pasta(List<String> toppings, List<String> sauces, Size size, boolean cheese, boolean pepper) {
        this.toppings = toppings;
        this.sauces = sauces;
        this.size = size;
        this.cheese = cheese;
        this.pepper = pepper;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public List<String> getSauces() {
        return sauces;
    }

    public Size getSize() {
        return size;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isPepper() {
        return pepper;
    }

    @Override
    public String toString() {
        return "Pasta [toppings=" + toppings + ", sauces=" + sauces + ", size=" + size + ", cheese=" + cheese
                + ", pepper=" + pepper + "]";
    }

    public static class Builder {
        //Mandatory
        private Size size;

        //Optional
        private List<String> toppings;
        private List<String> sauces;
        private boolean cheese;
        private boolean pepper;

        public Builder(Size size) {
            this.size = size;
        }

        public Builder withSauces(String... sauces) {
            this.sauces = Collections.unmodifiableList(Arrays.asList(sauces));
            return this;
        }

        public Builder withToppings(String... toppings) {
            this.toppings = Collections.unmodifiableList(Arrays.asList(toppings));
            return this;
        }

        public Builder withCheese() {
            this.cheese = true;
            return this;
        }

        public Builder withPepper() {
            this.pepper = true;
            return this;
        }

        public Pasta now() {
            return new Pasta(toppings, sauces, size, cheese, pepper);
        }
    }
}
