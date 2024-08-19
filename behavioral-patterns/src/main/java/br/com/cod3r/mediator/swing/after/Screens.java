package br.com.cod3r.mediator.swing.after;

import br.com.cod3r.mediator.swing.after.components.AddButton;
import br.com.cod3r.mediator.swing.after.components.Label;
import br.com.cod3r.mediator.swing.after.components.ResetButton;
import br.com.cod3r.mediator.swing.after.components.State;
import br.com.cod3r.mediator.swing.after.mediator.Mediator;

import javax.swing.*;
import java.awt.*;

public class Screens {
    private final AddButton button;
    private final ResetButton reset;
    private final Label label;
    private final Mediator mediator;

    public Screens() {
        mediator = new Mediator();
        button = new AddButton(mediator);
        reset = new ResetButton(mediator);
        label = new Label(mediator);
        State state = new State(mediator);
        mediator.setButton(button);
        mediator.setLabel(label);
        mediator.setState(state);
    }

    public void init() {
        initButtonScreen(mediator);
        initCounterScreen(mediator);
    }

    private void initButtonScreen(Mediator mediator) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Button's Screen");
        frame.setLayout(new BorderLayout());

        frame.add(reset, BorderLayout.WEST);
        frame.add(button, BorderLayout.CENTER);

        frame.setSize(400, 200);
        frame.setVisible(true);
    }

    private void initCounterScreen(Mediator mediator) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Counter's Screen");

        frame.add(label);

        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}