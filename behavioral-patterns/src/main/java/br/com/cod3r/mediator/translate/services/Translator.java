package br.com.cod3r.mediator.translate.services;

import br.com.cod3r.mediator.translate.model.Language;

import java.util.HashMap;
import java.util.Map;

public class Translator {

    private final Map<String, String> engToPor = new HashMap<>();
    private final Map<String, String> porToEng = new HashMap<>();

    public Translator() {
        porToEng.put("Oi", "Hello");
        porToEng.put("Tudo bem?", "How are you?");
        porToEng.put("Estou bem, obrigado.", "I'm fine, thanks");
        porToEng.put("Tchau", "Bye");
        engToPor.put("Hello", "Oi");
        engToPor.put("How are you?", "Tudo bem?");
        engToPor.put("I'm fine, thanks", "Estou bem, obrigado.");
        engToPor.put("Bye", "Tchau");
    }

    public String getTranslation(Language senderLanguage, Language receiverLanguage, String message) {
        if (senderLanguage.equals(receiverLanguage)) return message;
        if (senderLanguage == Language.PORTUGUESE)
            return porToEng.get(message) != null ? porToEng.get(message) : message;
        else
            return engToPor.get(message) != null ? engToPor.get(message) : message;
    }
}
