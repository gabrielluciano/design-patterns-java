package br.com.cod3r.state.headphone.after;

import br.com.cod3r.state.headphone.after.states.HeadPhoneState;
import br.com.cod3r.state.headphone.after.states.OffState;

public class HeadPhone {
    private boolean isOn;
    private boolean isPlaying;
    private HeadPhoneState state;

    public HeadPhone() {
        this.isOn = false;
        this.isPlaying = false;
        state = OffState.getInstance();
    }

    public void onLongClick() {
        System.out.println("Long Click Pressed...");
        state.longClick(this);
    }

    public void onClick() {
        System.out.println("Click Pressed...");
        state.click(this);
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public void setState(HeadPhoneState state) {
        this.state = state;
    }
}
