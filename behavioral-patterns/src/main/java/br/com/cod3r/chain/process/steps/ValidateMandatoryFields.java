package br.com.cod3r.chain.process.steps;

import br.com.cod3r.chain.process.service.ProcessContext;

public class ValidateMandatoryFields extends ProcessStep {

    public ValidateMandatoryFields(Object... args) {
        super(args);
    }

    @Override
    public ProcessContext execute(ProcessContext context) throws Exception {
        for (Object arg : args) {
            Object field = context.get((String) arg);
            if (field == null) throw new Exception(String.format("%s is empty", arg));
        }
        return next(context, true);
    }
}
