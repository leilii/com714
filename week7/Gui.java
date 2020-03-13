package week7;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Insets;

public class Gui extends JFrame {

    private GridBagConstraints constraints;

    public Gui() {
        this.setSize(500, 500);
        this.setLayout(new GridBagLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        constraints = new GridBagConstraints();

        addHeadingLabel();
        addTypeLabel();
        addTypeComboBox();
        addNameLabel();
        addNameTextField();
        addAgeLabel();
        addAgeTextField();
        addSubmitButton();

    }

    private void addHeadingLabel() {
        JLabel headingLabel = new JLabel("Living Thing");

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth =4 ;
        constraints.insets = new Insets(0, 4, 4, 30);
        this.add(headingLabel, constraints);
    }
    private void addTypeLabel(){
        JLabel typeLabel = new JLabel("Type: ");

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth =1 ;
        constraints.insets = new Insets(0, 2, 4, 5);
        this.add(typeLabel, constraints);
    }
    private void addTypeComboBox(){
              // array of string contating cities 
            String things[] = { "Human", "Plant", "Tiger", "Elephant", "SuperHuman" }; 
  
            // create checkbox 
            JComboBox typeComboBox = new JComboBox(things); 
            constraints.gridx = 1;
            constraints.gridy = 1;
            constraints.gridwidth =2 ;
            constraints.insets = new Insets(0, 2, 4, 30);
            this.add(typeComboBox, constraints);

        }

    private void addNameLabel(){
        JLabel nameLabel = new JLabel("Name: ");

        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth =1 ;
        constraints.insets = new Insets(2, 2, 4, 5);
        this.add(nameLabel, constraints);


    }
    private void addNameTextField() {
        JTextField nameTextField = new JTextField(8);
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridwidth =4 ;
        constraints.insets = new Insets(2, 2, 4, 30);
        this.add(nameTextField, constraints);

    }


    private void addAgeLabel(){
        JLabel ageLabel = new JLabel("Age: ");

        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth =1 ;
        constraints.insets = new Insets(0, 2, 4, 5);
        this.add(ageLabel, constraints);


    }
    private void addAgeTextField() {
        JTextField ageTextField = new JTextField(8);
        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.gridwidth =4 ;
        constraints.insets = new Insets(0, 2, 4, 30);
        this.add(ageTextField, constraints);

    }
    private void addSubmitButton() {
        JButton submitButton = new JButton(" Submit ");
        constraints.gridx = 1;
        constraints.gridy = 8;
        constraints.gridwidth =2 ;
        constraints.insets = new Insets(0, 2, 2, 30);
        this.add(submitButton, constraints);
    }

    public static void main(String[] args)
    {
        Gui gui = new Gui();
        gui.setVisible(true);
    }
}
