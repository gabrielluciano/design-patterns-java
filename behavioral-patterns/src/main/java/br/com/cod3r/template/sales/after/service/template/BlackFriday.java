package br.com.cod3r.template.sales.after.service.template;

import br.com.cod3r.template.sales.after.model.Cart;

import java.time.LocalDate;
import java.time.Month;

public class BlackFriday extends BestOfferTemplate {

    public BlackFriday(Cart cart) {
        super(cart);
    }

    @Override
    public boolean isApplicable() {
        return LocalDate.now().getMonth() == Month.NOVEMBER;
    }

    @Override
    protected void calibrateVariables() {
        priceFactor = 0.75d;
    }
}
