import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




public class Hong_Saw_Application {
	/**This application performs the Hong Saw functionality. It also uses a class specifically for calculating and printing the 
	 * results of the calculation. 	
	 * 
	 * The use enter a starting number and and an ending number. Main checks to ensure that the ending number is larger than 
	 * the starting number; if not, it swaps the starting and ending numbers (no message is displayed). It also checks to ensure
	 * the user entered integers. If not, an error message displays in the text area where output displays. The message stays in
	 * the text area until the user enters the correct input. Main then calls a constructor from the CountAndPrint class and instantiates
	 * the CountAndPrint object.
	 * 
	 * The results of the CountAndPrint object is returned to the FinalOutput string and displayed in the text area.
	 * 
	 * @author Jodi A DeGrave
	 * @version 1.0.0
	 * @param args is a string array which receives the command line arguments
	 * @return - Nothing since void is specified
	 *
	 */
	private JFrame frmNumberFrame;
	private JTextField textStartNumber;
	private JTextField textEndNumber;
	private int NumStart;
	private int NumEnd;
    private String FinalOutput = "";
    private int SwitchValues; 
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hong_Saw_Application window = new Hong_Saw_Application();
					window.frmNumberFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hong_Saw_Application() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNumberFrame = new JFrame();
		frmNumberFrame.setTitle("Hong Saw Application");
		frmNumberFrame.setBounds(100, 100, 450, 300);
		frmNumberFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNumberFrame.getContentPane().setLayout(null);
		
		JLabel lblStartNumber = new JLabel("Start Number:");
		lblStartNumber.setForeground(new Color(0, 128, 128));
		lblStartNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStartNumber.setBounds(58, 36, 88, 14);
		frmNumberFrame.getContentPane().add(lblStartNumber);
		
		JLabel lblEndNumber = new JLabel("End Number:");
		lblEndNumber.setForeground(new Color(0, 128, 128));
		lblEndNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEndNumber.setBounds(58, 61, 88, 14);
		frmNumberFrame.getContentPane().add(lblEndNumber);
		
		textStartNumber = new JTextField();
		textStartNumber.setBounds(156, 33, 86, 20);
		frmNumberFrame.getContentPane().add(textStartNumber);
		textStartNumber.setColumns(10);
		
		textEndNumber = new JTextField();
		textEndNumber.setBounds(156, 58, 86, 20);
		frmNumberFrame.getContentPane().add(textEndNumber);
		textEndNumber.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(21, 114, 403, 14);
		frmNumberFrame.getContentPane().add(separator);
		
		JTextArea textOutput = new JTextArea();
		textOutput.setRows(1000);
		textOutput.setWrapStyleWord(true);
		textOutput.setLineWrap(true);
		textOutput.setBounds(31, 139, 373, 101);
		textOutput.setAutoscrolls(true);
		frmNumberFrame.getContentPane().add(textOutput);
		
		JButton btnOk = new JButton("OK");
		btnOk.setForeground(new Color(0, 128, 128));
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			try{
				NumStart = Integer.parseInt(textStartNumber.getText());
				NumEnd = Integer.parseInt(textEndNumber.getText());
				
				//Switch Start and End values if the End value is less than the Start value
				if (NumEnd < NumStart){
					SwitchValues = NumStart;
					NumStart = NumEnd;
					NumEnd = SwitchValues;
					textStartNumber.setText(Integer.toString(NumStart));
					textEndNumber.setText(Integer.toString(NumEnd));
				}
				
				// CountAndPrint myResult = new CountAndPrint(NumStart, NumEnd); 
				CountAndPrint myResult = new CountAndPrint();
				myResult.setStartNum(NumStart);
				myResult.setEndNum(NumEnd);
								
				FinalOutput = myResult.getResult();
				textOutput.setText(FinalOutput);
				
			}catch(Exception e){
				textOutput.setText("Please enter integers only for Start Number and End Number.");
				textStartNumber.setText("");
				textEndNumber.setText("");
				
			}
			}});
		
		
	
		btnOk.setBounds(278, 32, 89, 23);
		frmNumberFrame.getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setForeground(new Color(0, 128, 128));
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmNumberFrame.dispose();
			}
		});
		btnCancel.setBounds(278, 61, 89, 23);
		frmNumberFrame.getContentPane().add(btnCancel);
		
			
		
	}
}