package br.com.cod3r.factory.apple.after.factory;

import br.com.cod3r.factory.apple.after.model.IPhone;
import br.com.cod3r.factory.apple.after.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone() {
        return new IPhoneXSMax();
    }
}
