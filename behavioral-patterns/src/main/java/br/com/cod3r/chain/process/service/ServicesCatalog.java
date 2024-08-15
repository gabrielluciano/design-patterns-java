package br.com.cod3r.chain.process.service;

import br.com.cod3r.chain.process.steps.ProcessStep;
import br.com.cod3r.chain.process.steps.SaveUser;
import br.com.cod3r.chain.process.steps.ValidateMandatoryFields;

public class ServicesCatalog {
    public static final ProcessStep saveUserProcess = buildChain(
            new ValidateMandatoryFields("name", "email", "password"),
            new SaveUser()
    );

    private static ProcessStep buildChain(ProcessStep... steps) {
        for (int index = 0; index < steps.length - 1; index++) {
            ProcessStep currentProcess = steps[index];
            currentProcess.setNextStep(steps[index + 1]);
        }
        return steps[0];
    }
}
