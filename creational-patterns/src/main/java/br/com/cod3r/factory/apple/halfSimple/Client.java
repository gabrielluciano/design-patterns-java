package br.com.cod3r.factory.apple.halfSimple;

import br.com.cod3r.factory.apple.halfSimple.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.halfSimple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.halfSimple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.halfSimple.model.IPhone;

public class Client {

    public static void main(String[] args) {
        IPhoneFactory genXFactory = new IPhoneXFactory();
        IPhoneFactory gen11Factory = new IPhone11Factory();

        System.out.println("### Ordering an iPhone X");
        IPhone iphoneX = genXFactory.orderIPhone("standard");
        System.out.println(iphoneX);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone11Pro = gen11Factory.orderIPhone("highEnd");
        System.out.println(iphone11Pro);
    }
}
