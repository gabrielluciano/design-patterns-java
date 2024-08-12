package br.com.cod3r.factory.apple.halfSimple.factory;

import br.com.cod3r.factory.apple.halfSimple.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIPhone(String level) {
        IPhone iPhone = null;

        iPhone = createIPhone(level);

        iPhone.getHardware();
        iPhone.assemble();
        iPhone.certificates();
        iPhone.pack();

        return iPhone;
    }

    protected abstract IPhone createIPhone(String level);
}
