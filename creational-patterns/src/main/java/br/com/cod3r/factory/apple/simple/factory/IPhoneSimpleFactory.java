package br.com.cod3r.factory.apple.simple.factory;

import br.com.cod3r.factory.apple.simple.model.IPhone;
import br.com.cod3r.factory.apple.simple.model.IPhone11;
import br.com.cod3r.factory.apple.simple.model.IPhone11Pro;
import br.com.cod3r.factory.apple.simple.model.IPhoneX;
import br.com.cod3r.factory.apple.simple.model.IPhoneXSMax;

public class IPhoneSimpleFactory {

    public IPhone orderIPhone(String generation, String level) {
        IPhone iPhone = null;

        if ("11".equals(generation)) {
            if ("standard".equals(level)) {
                iPhone = new IPhone11();
            } else if ("highEnd".equals(level)) {
                iPhone = new IPhone11Pro();
            }
        } else if ("X".equals(generation)) {
            if ("standard".equals(level)) {
                iPhone = new IPhoneX();
            } else if ("highEnd".equals(level)) {
                iPhone = new IPhoneXSMax();
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
