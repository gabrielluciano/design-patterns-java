package br.com.cod3r.command.alexa.after.command;

import br.com.cod3r.command.alexa.after.lights.GenericLight;

public class TurnOnLightCommand implements Command {
    private final GenericLight light;

    public TurnOnLightCommand(GenericLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        if (light != null) {
            light.turnOn();
        }
    }
}
