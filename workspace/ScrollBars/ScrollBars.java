import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.ComponentOrientation;
import javax.swing.ScrollPaneConstants;
import javax.swing.JSeparator;
import javax.swing.JLabel;

public class ScrollBars {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScrollBars window = new ScrollBars();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScrollBars() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(26, 143, 383, 89);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textOutput = new JTextArea();
		textOutput.setLineWrap(true);
		textOutput.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		textOutput.setWrapStyleWord(true);
		scrollPane.setViewportView(textOutput);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(26, 127, 383, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblStartNumber = new JLabel("Start Number:");
		lblStartNumber.setBounds(26, 28, 79, 14);
		frame.getContentPane().add(lblStartNumber);
		
		JLabel lblEndNumber = new JLabel("End Number:");
		lblEndNumber.setBounds(26, 53, 79, 14);
		frame.getContentPane().add(lblEndNumber);
	}
}
