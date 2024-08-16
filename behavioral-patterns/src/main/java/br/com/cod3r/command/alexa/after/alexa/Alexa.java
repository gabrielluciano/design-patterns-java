package br.com.cod3r.command.alexa.after.alexa;

import br.com.cod3r.command.alexa.after.command.Command;
import br.com.cod3r.command.alexa.after.lights.PhillipsHueLight;
import br.com.cod3r.command.alexa.after.lights.XiaomiLight;

import java.util.HashMap;
import java.util.Map;

public class Alexa {
	private Map<String, Command> integrations;
	private AlexaAI ai;
	
	public Alexa() {
		integrations = new HashMap<>();
		ai = new AlexaAI();
	}

	public void addIntegration(String key, Command command, String... keywords) {
		integrations.put(key, command);
		ai.addAssociation(key, keywords);
	}

	public void sendRequest(String request) {
		Command command = integrations.get(request)	;
		if (command == null) {
			String key = ai.findAssociations(request);
			command = integrations.get(key);
			if (command == null) {
				System.out.println("Sorry, I can't perform your request!");
				return;
			}
		}
		command.execute();
	}
}
