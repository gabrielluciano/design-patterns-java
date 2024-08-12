package br.com.cod3r.abstractfactory.app.service.factory;

import br.com.cod3r.abstractfactory.app.service.services.CarService;
import br.com.cod3r.abstractfactory.app.service.services.UserService;
import br.com.cod3r.abstractfactory.app.service.services.rest.CarRestService;
import br.com.cod3r.abstractfactory.app.service.services.rest.UserRestService;

public class RestAbstractFactory implements ServicesAbstractFactory{
    @Override
    public UserService getUserService() {
        return new UserRestService();
    }

    @Override
    public CarService getCarService() {
        return new CarRestService();
    }
}
