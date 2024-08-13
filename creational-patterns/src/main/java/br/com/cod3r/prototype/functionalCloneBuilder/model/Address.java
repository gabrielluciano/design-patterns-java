package br.com.cod3r.prototype.functionalCloneBuilder.model;

public class Address implements Cloneable {
    private final String street;
    private final Integer number;

    public Address(String street, Integer number) {
        super();
        this.street = street;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }

    @Override
    public String toString() {
        return "Address [street=" + street + ", number=" + number + "]";
    }

    public Builder cloneBuilder() throws CloneNotSupportedException {
        return new Builder(this.clone());
    }

    public static class Builder {
        private String street;
        private Integer number;

        private Builder(Address address) {
            this.street = address.street;
            this.number = address.number;
        }

        public Builder withStreet(String street) {
            this.street = street;
            return this;
        }

        public Builder withNumber(Integer number) {
            this.number = number;
            return this;
        }
    }
}
