package br.com.cod3r.state.headphone.after.states;

import br.com.cod3r.state.headphone.after.HeadPhone;

public class OffState implements HeadPhoneState {
    private static final HeadPhoneState instance = new OffState();

    private OffState() {
    }

    public static HeadPhoneState getInstance() {
        return instance;
    }

    @Override
    public void click(HeadPhone headPhone) {
        // Do nothing
    }

    @Override
    public void longClick(HeadPhone headPhone) {
        headPhone.setOn(true);
        System.out.println("> Turning On");
        headPhone.setState(OnState.getInstance());
    }
}
