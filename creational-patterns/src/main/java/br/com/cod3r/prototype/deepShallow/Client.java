package br.com.cod3r.prototype.deepShallow;

import br.com.cod3r.prototype.deepShallow.model.Address;
import br.com.cod3r.prototype.deepShallow.model.User;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		User user = new User("Original", 25, new Address("ABC Street", 1000));
		System.out.println(user);
		
		User cloneUser = user.clone();
		cloneUser.name = "Clone";
		cloneUser.address.street = "Double Street";
		System.out.println(user);
		System.out.println(cloneUser);
	}
}
