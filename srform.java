import javax.swing.*;

class srform 
{
    public static void main(String[] args) 
    {
        JFrame frame=new JFrame("Student Registration Form"); //name of the frame
        frame.setSize(400, 500); //size of the frame in pixels
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //the code stops running upon the user pressing "X"
        frame.setLayout(null); //layout is set to null
        frame.setLocationRelativeTo(null); //frame appears at the center of the screen

        //creating frame components
        JLabel nameLabel=new JLabel("NAME: "); //label created for name
        nameLabel.setBounds(40, 40, 100, 20);
        JTextField nameField=new JTextField(); //field created for accepting the name
        nameField.setBounds(120, 40, 200, 20);

        JLabel rollLabel=new JLabel("ROLL: "); //label created for roll number
        rollLabel.setBounds(40, 80, 100, 20);
        JTextField rollField=new JTextField(); //field created for accepting the roll number
        rollField.setBounds(120, 80, 200, 20);

        JLabel emailLabel=new JLabel("EMAIL: "); //label created for email address
        emailLabel.setBounds(40, 120, 100, 20);
        JTextField emailField=new JTextField(); //field created for accepting the email address
        emailField.setBounds(120, 120, 200, 20);

        JLabel genderLabel=new JLabel("GENDER: "); //label created for gender
        genderLabel.setBounds(40, 160, 100, 20);
        JRadioButton forFemales=new JRadioButton("FEMALE"); //radio button for females
        forFemales.setBounds(140, 160, 200, 20);
        JRadioButton forMales=new JRadioButton("MALE"); //radio button for males
        forMales.setBounds(220, 160, 200, 20);
    

        JLabel addressLabel=new JLabel("ADDRESS: "); //label created for address
        addressLabel.setBounds(40, 200, 100, 20);
        JTextArea addressArea=new JTextArea(); //text area for accepting the address
        addressArea.setBounds(120, 200, 200, 20);

        JCheckBox check=new JCheckBox("I agree to all the terms and conditions."); //checkbox created
        check.setBounds(70, 240, 500, 20);

        JButton submit=new JButton("SUBMIT"); //button created for submission
        submit.setBounds(120, 290, 100, 20);

        //submit.addActionListener(new ActionListener()); //to detect if the submit button has been pressed

        //taking inputs
        String name=nameField.getText();
        String roll=rollField.getText();
        String email=emailField.getText();
        String gender=nameField.getText();
        String address=addressArea.getText();

        //components of the frame are made visible
        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(rollLabel);
        frame.add(rollField);

        frame.add(emailLabel);
        frame.add(emailField);

        frame.add(genderLabel);
        frame.add(forMales);
        frame.add(forFemales);

        frame.add(addressLabel);
        frame.add(addressArea);

        frame.add(check);

        frame.add(submit);

        frame.setVisible(true); //frame is made visible
    }
}