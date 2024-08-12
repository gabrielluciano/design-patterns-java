package br.com.cod3r.factory.apple.before;

import br.com.cod3r.factory.apple.before.model.IPhone;
import br.com.cod3r.factory.apple.before.model.IPhone11;
import br.com.cod3r.factory.apple.before.model.IPhone11Pro;
import br.com.cod3r.factory.apple.before.model.IPhoneX;
import br.com.cod3r.factory.apple.before.model.IPhoneXSMax;

public class Client {
	
	public static void main(String[] args) {
		Client client = new Client();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphoneX = client.orderIPhone("X", "standard");
		System.out.println(iphoneX);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone11Pro = client.orderIPhone("11", "highEnd");
		System.out.println(iphone11Pro);
	}

	public IPhone orderIPhone(String generation, String level) {
		IPhone iPhone = null;

		if ("X".equals(generation)) {
			if ("standard".equals(level)) {
				iPhone = new IPhoneX();
			} else if ("highEnd".equals(level)) {
				iPhone = new IPhoneXSMax();
			}
		} else if ("11".equals(generation)) {
			if ("standard".equals(level)) {
				iPhone = new IPhone11();
			} else if ("highEnd".equals(level)) {
				iPhone = new IPhone11Pro();
			}
		}

		if (iPhone != null) {
			iPhone.getHardware();
			iPhone.assemble();
			iPhone.certificates();
			iPhone.pack();
		}

		return iPhone;
	}
}
