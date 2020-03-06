package week6;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Gui extends JFrame {
    JPanel greetingPanel;
    JPanel bodyPanel;

    private static final long serialVersionUID = 1L;

    public Gui() {
        this.setSize(new Dimension(500, 500));
        this.setLayout(new BorderLayout());

        addGreetingPanel();
        addGreetingLabel();
        addGreetingTextField();
        addGreetingButton();
        addBodyPanel();
        addBodyButtons();
    }

    private void addGreetingButton() {
        JButton greetingButton = new JButton(" DispLay Greeting");
        greetingPanel.add(greetingButton);

    }

    private void addGreetingTextField() {
        JTextField greetingTextField = new JTextField();
        greetingTextField.setPreferredSize(new Dimension(200, 50));
        greetingPanel.add(greetingTextField);

    }

    private void addGreetingPanel() {
        greetingPanel = new JPanel();
        this.add(greetingPanel, BorderLayout.NORTH);

    }

    private void addGreetingLabel() {
        JLabel greetingLabel = new JLabel("Enter greeting:");
        greetingPanel.add(greetingLabel);
    }


    private void addBodyPanel(){
       bodyPanel= new JPanel();
       this.add(bodyPanel, BorderLayout.CENTER);

    }
    private void addBodyButtons() {
        JButton bodyButton1 = new JButton(" Key1");
        bodyPanel.add(bodyButton1);

        JButton bodyButton2 = new JButton(" Key2");
        bodyPanel.add(bodyButton2);
        
        JButton bodyButton3 = new JButton(" Key3");
        bodyPanel.add(bodyButton3);

    }

    public static void main(String[] args) {
        Gui gui = new Gui();
        gui.setVisible(true);
    }
}
