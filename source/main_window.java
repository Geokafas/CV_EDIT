package Graphics;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;






public class main_window extends JFrame implements ActionListener{
	private static final int WIDTH = 640;
	private static final int HEIGHT = 800;
	private static final int NUMBER_OF_CHARS = 30;
	private static String user_name;
	private static String user_adress;
	private static String user_email;
        private static String user_profile_name;
	private static int user_phone_number;
	private static JTextField userNameField;
	private static JTextField userAdressField;
	private static JTextField userEmailField;
	private static JTextField userPhoneNumberField;
        private static JTextField userProfileName;
        private static ArrayList<user_credentials> users = new ArrayList<user_credentials>();
        
	user_credentials user = new user_credentials();
        
	public user_credentials return_user_credentials(){
		user.name = user_name;
		user.adress = user_adress;
		user.email = user_email;
		user.phone_number = user_phone_number;
                user.profile_name = user_profile_name;
                //users.add();
		return user;
	}
	
	public static void get_user_name(String name){
		user_name = name;
	}
	
	public static void get_user_adress(String adress){
		user_adress = adress;
	}
	
	public static void get_user_email(String email){
		user_email = email;
	}
	
	public static void get_user_phone(int phone){
		user_phone_number = phone;
	}
        
        public static void get_user_profile_name(String profile){
		user_profile_name = profile;
	}
	
	public main_window(){
		
		//Set window parameters                
		setSize(HEIGHT,WIDTH);
		setVisible(true);
		setTitle("CV Editor: Profiles");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
                setLocationRelativeTo(null);//start window from the center of the screen
		//setLayout(new BorderLayout());
		
		
		//Create Image Icon
		ImageIcon ico = new ImageIcon("\favicon.ico");
		setIconImage(ico.getImage());
		
		
		//Set window dialogs
		JPanel textPanel = new JPanel();
		textPanel.setLayout(new SpringLayout());
		textPanel.setBounds(50, 50, 400, 800);
		textPanel.setBorder(BorderFactory.createTitledBorder("Personal Info:"));
                
                //define labels
                JLabel profileNamel = new JLabel("Profile Name: ", JLabel.TRAILING);
                JLabel namel = new JLabel("Name: ", JLabel.TRAILING);
                JLabel emaill = new JLabel("Email: ", JLabel.TRAILING);
                JLabel phoneNumberl = new JLabel("Phone Number: ", JLabel.TRAILING);
                JLabel adressl = new JLabel("Adress: ", JLabel.TRAILING);
                
                //add labels to panel
                textPanel.add(profileNamel);
                textPanel.add(namel);
                textPanel.add(adressl);
                textPanel.add(emaill);
                textPanel.add(phoneNumberl);
                		
		//define TextFields
		userNameField = new JTextField(NUMBER_OF_CHARS);
		userAdressField = new JTextField(NUMBER_OF_CHARS);
		userEmailField = new JTextField(NUMBER_OF_CHARS);
		userPhoneNumberField = new JTextField(NUMBER_OF_CHARS);
                userProfileName = new JTextField(NUMBER_OF_CHARS);
                
                
		//set background
		userNameField.setBackground(Color.LIGHT_GRAY);
		userAdressField.setBackground(Color.LIGHT_GRAY);
		userEmailField.setBackground(Color.LIGHT_GRAY);
		userPhoneNumberField.setBackground(Color.LIGHT_GRAY);
                userProfileName.setBackground(Color.LIGHT_GRAY);
                
		
                
                //set label to text fields
                profileNamel.setLabelFor(userProfileName);
                namel.setLabelFor(userNameField);
                adressl.setLabelFor(userAdressField);
                emaill.setLabelFor(userEmailField);
                phoneNumberl.setLabelFor(userPhoneNumberField);
                
                //add text fields to panel
                textPanel.add(userProfileName);
		textPanel.add(userNameField);
		textPanel.add(userAdressField);
		textPanel.add(userEmailField);
		textPanel.add(userPhoneNumberField);
                
                //set border and behavior 
                userProfileName.setBorder(BorderFactory.createBevelBorder(CROSSHAIR_CURSOR, getBackground(), getForeground()));
		userNameField.setBorder(BorderFactory.createBevelBorder(CROSSHAIR_CURSOR, getBackground(), getForeground()));
		userAdressField.setBorder(BorderFactory.createBevelBorder(CROSSHAIR_CURSOR, getBackground(), getForeground()));
		userEmailField.setBorder(BorderFactory.createBevelBorder(CROSSHAIR_CURSOR, getBackground(), getForeground()));
		userPhoneNumberField.setBorder(BorderFactory.createBevelBorder(CROSSHAIR_CURSOR, getBackground(), getForeground()));
                
                //Lay out the panel.
               // SpringUtilities.makeCompactGrid(textPanel,
                //                               5, 2, //rows, cols
                //                               50, 50,        //initX, initY
                 //                              50, 50);       //xPad, yPad
                
                //set window buttons
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(this);
		textPanel.add(submitButton);
                
                add(textPanel,SpringLayout.VERTICAL_CENTER);
                
	}
	//add button functionallity
	public void actionPerformed(ActionEvent e){
		//TODO catch name format error
		try{
			correct_input(e);
		}catch(NumberFormatException e2){
			userPhoneNumberField.setText("Error: Reenter phone number");
		}
	}
	//exception
	public void correct_input(ActionEvent e){
		String actionCommand = e.getActionCommand();
		if(actionCommand.equals("Submit")){
			get_user_name(userNameField.getText());
			get_user_adress(userAdressField.getText());
			get_user_email(userEmailField.getText());
			get_user_phone(Integer.parseInt(userPhoneNumberField.getText()));
                        get_user_profile_name(userProfileName.getText());
			return_user_credentials();
                        WriteToFile writeTo = new WriteToFile();
                        writeTo.writeToFile(user);
                        System.out.println(user_phone_number);
			//System.out.println(credentials);
		}
	}


	//public static void main(String[] args) {
       //         welcome_window welWindow = new welcome_window();
        //        welWindow.setVisible(true);
	//}

}
