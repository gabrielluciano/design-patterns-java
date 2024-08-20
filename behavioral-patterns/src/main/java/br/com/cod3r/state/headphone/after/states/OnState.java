package br.com.cod3r.state.headphone.after.states;

import br.com.cod3r.state.headphone.after.HeadPhone;

public class OnState implements HeadPhoneState {
    private static final HeadPhoneState instance = new OnState();

    private OnState() {
    }

    public static HeadPhoneState getInstance() {
        return instance;
    }

    @Override
    public void click(HeadPhone headPhone) {
        headPhone.setPlaying(true);
        System.out.println("> Resume Player");
        headPhone.setState(PlayingState.getInstance());
    }

    @Override
    public void longClick(HeadPhone headPhone) {
        headPhone.setOn(false);
        System.out.println("> Turning Off");
        headPhone.setState(OffState.getInstance());
    }
}
