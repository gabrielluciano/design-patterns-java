package br.com.cod3r.command.alexa.before.alexa;

import java.util.HashMap;
import java.util.Map;

import br.com.cod3r.command.alexa.before.lights.PhillipsHueLight;
import br.com.cod3r.command.alexa.before.lights.XiaomiLight;

public class Alexa {
	private Map<String, Object> integrations;
	
	public Alexa() {
		integrations = new HashMap<String, Object>();
		integrations.put("LivingRoomLight", new PhillipsHueLight());
		integrations.put("KitchenLight", new XiaomiLight());
	}

	public void sendRequest(String request) {
		if(request.equals("Turn on the Living room light")) {
			System.out.println("Turning on the Living room light");
			PhillipsHueLight light = (PhillipsHueLight) integrations.get("LivingRoomLight");
			light.turnOn();
		} else if(request.equals("Turn off the Living room light")) {
			System.out.println("Turning off the Living room light");
			PhillipsHueLight light = (PhillipsHueLight) integrations.get("LivingRoomLight");
			light.turnOff();
		} else if(request.equals("Turn on the Kitchen light")) {
			System.out.println("Turning on the Kitchen light");
			XiaomiLight light = (XiaomiLight) integrations.get("KitchenLight");
			light.turnOn();
		} else if(request.equals("Turn off the Kitchen light")) {
			System.out.println("Turning off the Kitchen light");
			XiaomiLight light = (XiaomiLight) integrations.get("KitchenLight");
			light.turnOff();
		} else {
			System.out.println("Sorry, I can't perform your request!");
		}
			 
	}
}
