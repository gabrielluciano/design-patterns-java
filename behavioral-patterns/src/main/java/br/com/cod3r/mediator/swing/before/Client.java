package br.com.cod3r.mediator.swing.before;

import br.com.cod3r.mediator.swing.before.components.AddButton;
import br.com.cod3r.mediator.swing.before.components.Label;
import br.com.cod3r.mediator.swing.before.components.ResetButton;
import br.com.cod3r.mediator.swing.before.components.State;

import javax.swing.*;
import java.awt.*;

public class Client {
    private final AddButton button;
    private final ResetButton reset;
    private final Label label;

	public Client() {
		State state = new State();
        label = new Label(state);
        button = new AddButton(state, label);
        reset = new ResetButton(state, label, button);
    }

    public static void main(String[] args) {
        new Client().run();
    }

    public void run() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JLabel title = new JLabel("Counter");
        frame.add(title, BorderLayout.NORTH);

        frame.add(reset, BorderLayout.WEST);
        frame.add(button, BorderLayout.CENTER);
        frame.add(label, BorderLayout.SOUTH);

        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
