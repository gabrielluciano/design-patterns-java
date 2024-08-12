package br.com.cod3r.factory.apple.after.factory;

import br.com.cod3r.factory.apple.after.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIPhone() {
        IPhone iPhone = null;

        iPhone = createIPhone();

        iPhone.getHardware();
        iPhone.assemble();
        iPhone.certificates();
        iPhone.pack();

        return iPhone;
    }

    protected abstract IPhone createIPhone();
}
