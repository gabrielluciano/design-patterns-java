package br.com.cod3r.abstractfactory.app.service.services.ejb;

import br.com.cod3r.abstractfactory.app.service.services.UserService;

public class UserEJBService implements UserService {

	@Override
	public void save(String name) {
		System.out.println("Saving " + name + " through EJB's interface");
	}

	@Override
	public boolean delete(Integer id) {
		System.out.println("Removing User #" + id + " through EJB's interface");
		return true;
	}

}
