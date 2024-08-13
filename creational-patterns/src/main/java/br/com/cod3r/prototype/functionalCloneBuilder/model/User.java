package br.com.cod3r.prototype.functionalCloneBuilder.model;

public class User implements Cloneable {
    private final String name;
    private final Integer age;
    private final Address address;

    public User(String name, Integer age, Address address) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        Address cloneAddress = address.clone();
        return new User(name, age, cloneAddress);
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + ", address=" + address + "]";
    }

    public Builder cloneBuilder() throws CloneNotSupportedException {
        return new Builder(this.clone());
    }

    public static class Builder {
        private String name;
        private Integer age;
        private Address address;

        private Builder(User user) {
            this.name = user.name;
            this.age = user.age;
            this.address = user.address;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder withAddress(Address address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(name, age, address);
        }
    }
}
