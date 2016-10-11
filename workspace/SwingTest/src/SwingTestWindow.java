import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

import net.codejava.sound.MyAudioPlayer;


/**	This is project creates a Java GUI to run as a desktop application. It presents a form with a text box and three buttons. 
 * 	The user enters a string (a name preferably), clicks the OK button and the application displays a message box with a 
 * 	"Hello World greeting with the name entered from the text box. The user can also choose to cancel the application, which 
 * 	closes the GUI and terminates the program. Or, the user can click a third button which opens another form.
 * 
 * @author Jodi A De Grave and anonymous coder for MyAudioPlayer.java class
 * @version 1.0.0
 * @returns This project returns nothing, since "void" is specified
 * @param args - is a string array from the GUI design
 */



public class SwingTestWindow {

	// Create the base form, a label, and a textbox, as well as the secondary form
	private JFrame frmFormFrame;
	private final JLabel lblNewLabel = new JLabel("Name:");
	private JTextField txtName;
	private JButton btnNewForm;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingTestWindow window = new SwingTestWindow();
					window.frmFormFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingTestWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		//Create the frame and set its attributes
		frmFormFrame = new JFrame();
		frmFormFrame.setForeground(Color.BLUE);
		frmFormFrame.setFont(new Font("Dialog", Font.BOLD, 12));
		frmFormFrame.setTitle("Hello World - Eclipse Gui");
		frmFormFrame.setBounds(100, 100, 450, 300);
		frmFormFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFormFrame.getContentPane().setLayout(null);
		
		//Create the OK button and set its attributes
		JButton btnOk = new JButton("Ok");
		btnOk.setForeground(Color.BLUE);
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		// Display the Hello World message dialog with text from the text box (txtName), then clears the text box
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hellow World! Hello, " + txtName.getText() + "!", "Hello World!", 1 );
				txtName.setText("");
			}
			
		});
		
		//Position the OK button 
		btnOk.setBounds(25, 187, 89, 23);
		
		//Add the button to the frame
		frmFormFrame.getContentPane().add(btnOk);
		
		
		//Create the Cancel button and exit the program when clicked
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmFormFrame.dispose();
			}
		});
		
		//Set the Cancel button properties
		btnCancel.setForeground(Color.BLUE);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancel.setBounds(297, 187, 89, 23);
		frmFormFrame.getContentPane().add(btnCancel);
		
		
		//Set the label properties and location, and add to the frame
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(25, 51, 44, 31);
		frmFormFrame.getContentPane().add(lblNewLabel);
		
		//Create the text box and set the attributes and location, and add to the frame
		txtName = new JTextField();
		txtName.setBounds(157, 56, 229, 20);
		frmFormFrame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		//Create the New Form button and set its attributes (location, size) and add to the New Frame 
		btnNewForm = new JButton("New Form");
		
		btnNewForm.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewForm.setForeground(new Color(60, 179, 113));
		btnNewForm.setBounds(161, 187, 89, 23);
		frmFormFrame.getContentPane().add(btnNewForm);
		
		//Create the new form/frame
		btnNewForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			//Create a new frame and set the attributes (size, location, layout, etc.)
			JFrame frmNewForm = new JFrame("New Frame!");
			frmNewForm.setVisible(true);
			frmNewForm.setForeground(Color.BLUE);
			frmNewForm.setFont(new Font("Dialog", Font.BOLD, 12));
			frmNewForm.setBounds(300, 300, 200, 150);
			frmNewForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frmNewForm.getContentPane().setLayout(null);
			
			
			//Create a new button for the new form and set its attributes
			JButton btnNewFormExit = new JButton("Bye!");
			
			//Set the NewFormExit attributes
			btnNewFormExit.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnNewFormExit.setForeground(new Color(60, 179, 113));
			btnNewFormExit.setBounds(50, 50, 89, 23);
			frmNewForm.getContentPane().add(btnNewFormExit);
			
			//Play Pacman death sound and close the application when the "Bye" button is clicked
			btnNewFormExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
				final String myAudioFilePath = "C:/Users/jdegrave/workspace/SwingTest/pacman_death.wav";	
				MyAudioPlayer.main(myAudioFilePath);
				frmNewForm.dispose();
				frmFormFrame.dispose();
			}			
								
			});
		}});
		
	}

}
