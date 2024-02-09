
import javax.swing.*;
import java.awt.*;

public class CreatingUserInputFrom {

    CreatingUserInputFrom (){
        JFrame userInputForm = new JFrame("User Input Form");
        JLabel userNameLabel = new JLabel("Enter Your Full Names: ");
        JTextField userNameTextField =  new JTextField(10);
        userNameTextField.setSize(20, 100);

        JLabel userAgeLabel = new JLabel("Enter Your Age: ");
        JTextField userAgeTextField =  new JTextField(2);


        JLabel userGenderLabel = new JLabel("Enter Your Gender: ");
        JTextField userGenderTextField =  new JTextField(1);

        JLabel userCountryOfOriginLabel = new JLabel("Enter Your Country Of Origin: ");
        JTextField userCountryOfOriginTextField =  new JTextField(30);

        JButton okayButton = new JButton("Okay");

        JButton cancelButton = new JButton("Cancel");


        userInputForm.add(userNameLabel);
        userInputForm.add(userNameTextField);

        userInputForm.add(userAgeLabel);
        userInputForm.add(userAgeTextField);

        userInputForm.add(userGenderLabel);
        userInputForm.add(userGenderTextField);

        userInputForm.add(userCountryOfOriginLabel);
        userInputForm.add(userCountryOfOriginTextField);

        userInputForm.add(okayButton);
        userInputForm.add(cancelButton);


        userInputForm.setLayout(new GridLayout(6, 2, 20 , 25));
        userInputForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        userInputForm.setSize(420, 420);
        //userInputForm.setResizable(false);
        userInputForm.setVisible(true);



    }
    public static void main(String[] args) {
        new CreatingUserInputFrom ();

    }
}