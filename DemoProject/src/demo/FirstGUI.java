package demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstGUI window = new FirstGUI();
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
	public FirstGUI() {
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
		
		textField = new JTextField();
		textField.setBounds(37, 21, 176, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(225, 21, 189, 40);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdd.setBounds(155, 90, 117, 29);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSubtract = new JButton("SUBTRACT");
		btnSubtract.setBounds(155, 143, 117, 29);
		frame.getContentPane().add(btnSubtract);
		
		textField_2 = new JTextField();
		textField_2.setBounds(138, 210, 153, 40);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAnswer = new JLabel("Answer:");
		lblAnswer.setBounds(50, 216, 76, 28);
		frame.getContentPane().add(lblAnswer);
	}
}
