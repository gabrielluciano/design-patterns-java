package br.com.cod3r.mediator.swing.after.components;

import br.com.cod3r.mediator.swing.after.mediator.Mediator;

import javax.swing.*;

public class ResetButton extends JButton {
    private static final long serialVersionUID = -6170178595314483794L;

    public ResetButton(Mediator mediator) {
        super("Reset");

        this.addActionListener(e -> mediator.reset());
    }

}
