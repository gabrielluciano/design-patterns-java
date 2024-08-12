package br.com.cod3r.factory.apple.after;

import br.com.cod3r.factory.apple.after.factory.IPhone11ProFactory;
import br.com.cod3r.factory.apple.after.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.after.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.after.model.IPhone;

public class Client {

    public static void main(String[] args) {
        IPhoneFactory iPhoneXFactory = new IPhoneXFactory();
        IPhoneFactory iPhone11ProFactory = new IPhone11ProFactory();

        System.out.println("### Ordering an iPhone X");
        IPhone iphoneX = iPhoneXFactory.orderIPhone();
        System.out.println(iphoneX);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone11Pro = iPhone11ProFactory.orderIPhone();
        System.out.println(iphone11Pro);
    }
}
