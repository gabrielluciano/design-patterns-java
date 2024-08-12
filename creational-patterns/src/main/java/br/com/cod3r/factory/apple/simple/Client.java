package br.com.cod3r.factory.apple.simple;

import br.com.cod3r.factory.apple.simple.factory.IPhoneSimpleFactory;
import br.com.cod3r.factory.apple.simple.model.IPhone;

public class Client {

    public static void main(String[] args) {
        IPhoneSimpleFactory iPhoneSimpleFactory = new IPhoneSimpleFactory();

        System.out.println("### Ordering an iPhone X");
        IPhone iphoneX = iPhoneSimpleFactory.orderIPhone("X", "standard");
        System.out.println(iphoneX);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone11Pro = iPhoneSimpleFactory.orderIPhone("11", "highEnd");
        System.out.println(iphone11Pro);
    }
}
