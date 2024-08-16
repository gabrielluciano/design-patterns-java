package br.com.cod3r.command.alexa.after;

import br.com.cod3r.command.alexa.after.alexa.Alexa;
import br.com.cod3r.command.alexa.after.command.TurnOffLightCommand;
import br.com.cod3r.command.alexa.after.command.TurnOnLightCommand;
import br.com.cod3r.command.alexa.after.lights.PhillipsHueLight;
import br.com.cod3r.command.alexa.after.lights.XiaomiLight;

public class Client {

    public static void configureAlexa(Alexa alexa) {
        PhillipsHueLight livingRoom = new PhillipsHueLight();
        XiaomiLight kitchen = new XiaomiLight();

        alexa.addIntegration("Turn on the Living room light",
                new TurnOnLightCommand(livingRoom), "on", "Living room", "light");
        alexa.addIntegration("Turn off the Living room light",
                new TurnOffLightCommand(livingRoom), "off", "Living room", "light");
        alexa.addIntegration("Turn on the Kitchen light",
                new TurnOnLightCommand(kitchen), "on", "Kitchen", "light");
        alexa.addIntegration("Turn off the Kitchen light",
                new TurnOffLightCommand(kitchen), "off", "Kitchen", "light");
    }

    public static void main(String[] args) {
        Alexa alexa = new Alexa();
        configureAlexa(alexa);

        alexa.sendRequest("Turn on the Living room light");
        alexa.sendRequest("Turn off the Kitchen light");

        alexa.sendRequest("Please, could you Turn off the Living room light?");

        alexa.sendRequest("off light");
        alexa.sendRequest("on Kitchen light");
    }
}
