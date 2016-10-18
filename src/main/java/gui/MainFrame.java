/***
* MainFrame class
* @author: Carina Ekström
* @version: 1.0
**/

package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import otherclasses.Calculator;

public class MainFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblResult = new JLabel("");
	private Calculator calc = new Calculator();
	private DecimalFormat df = new DecimalFormat("#,###.##", new DecimalFormatSymbols(new Locale("sv", "SE")));

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
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
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNumber = new JLabel("Number 1:");
		lblNumber.setBounds(50, 30, 75, 15);
		frame.getContentPane().add(lblNumber);
		
		JLabel lblNumber_1 = new JLabel("Number 2:");
		lblNumber_1.setBounds(50, 60, 75, 15);
		frame.getContentPane().add(lblNumber_1);
		
		textField = new JTextField();
		textField.setBounds(170, 30, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(170, 60, 114, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Double result = calc.add(Double.parseDouble(textField.getText()), Double.parseDouble(textField_1.getText()));
					lblResult.setText(df.format(result).toString());
				}catch(NumberFormatException e1){
					lblResult.setText("Use . for decimal numbers");
				}
			}
		});
		button.setBounds(85, 106, 117, 25);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Double result = calc.subtract(Double.parseDouble(textField.getText()), Double.parseDouble(textField_1.getText()));
					lblResult.setText(df.format(result).toString());
				}catch(NumberFormatException e1){
					lblResult.setText("Use . for decimal numbers");
				}

			}
		});
		button_1.setBounds(248, 106, 117, 25);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("*");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Double result = calc.multiply(Double.parseDouble(textField.getText()), Double.parseDouble(textField_1.getText()));
					lblResult.setText(df.format(result).toString());
				}catch(NumberFormatException e1){
					lblResult.setText("Use . for decimal numbers");
				}

			}
		});
		button_2.setBounds(85, 156, 117, 25);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("/");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Double result = calc.divide(Double.parseDouble(textField.getText()), Double.parseDouble(textField_1.getText()));
					lblResult.setText(df.format(result).toString());
				}catch(NumberFormatException e1){
					lblResult.setText("Use . for decimal numbers");
				}

			}
		});
		button_3.setBounds(248, 156, 117, 25);
		frame.getContentPane().add(button_3);
		
		JLabel lblResultText = new JLabel("Result:");
		lblResultText.setBounds(50, 217, 70, 15);
		frame.getContentPane().add(lblResultText);
		lblResult.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblResult.setBounds(115, 217, 270, 15);
		frame.getContentPane().add(lblResult);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
