package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneFactory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.USRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {

		System.out.println("# Ordering US iPhone 11 Pro");
		CountryRulesAbstractFactory usRules = new USRulesAbstractFactory();
		IPhoneFactory iPhone11Factory = new IPhone11Factory(usRules);

		IPhone iPhone11Pro = iPhone11Factory.orderIPhone("highEnd");
		System.out.println(iPhone11Pro);

		System.out.println("\n\n# Ordering Brazilian iPhone X");
		CountryRulesAbstractFactory brazilianRules = new BrazilianRulesAbstractFactory();
		IPhoneFactory iPhoneXFactory = new IPhoneXFactory(brazilianRules);

		IPhone iPhoneX = iPhoneXFactory.orderIPhone("standard");
		System.out.println(iPhoneX);
	}
}
