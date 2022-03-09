/**
 * 
 */
package Week2;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 * @author kevinhalliwell
 * SER216
 * Assignment 2
 * Week 2
 * Spring 2017
 *
 */
public class Assignment2 {
	JFrame frame = new JFrame("Binary to Decimal Converter"); //Create frame
	JPanel panel = new JPanel(); //Create panel
	JLabel binary = new JLabel("Binary"); //Create binary label
	JLabel decimal = new JLabel("Decimal"); //Create decimal label
	JTextField binaryEntry = new JTextField(); //Create binary entry field
	JTextField decimalEntry = new JTextField(); //Create decimal entry field (display answer)
	JButton b1 = new JButton("Convert to Decimal"); //Create button
	int checkInput = 0; //Error check users input
	String input = ""; //Input from user
	
	//Declare ParseBinary Method
	public static long parseBinary(String input) throws NumberFormatException {
		long number = 0;
		try
		{
			//check to see if the number is binary
			number = Long.parseLong(input, 2);
		}
		//If the number is not base two return a zero
		catch (Exception e) 
		{
			return 0;
		}
		return number;
	}
	
	//Constructor
	public Assignment2() {
		
		//Add panel and use grid bag layout
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(10, 5, 5, 10);
		
		//Add binary label
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel.add(binary, gbc);
		
		//Add decimal label
		gbc.gridx = 0;
		gbc.gridy = 1;
		panel.add(decimal, gbc);
		
		//Add binary entry field
		gbc.gridx = 1;
		gbc.gridy = 0;
		panel.add(binaryEntry, gbc);
		
		//Add decimal entry field
		gbc.gridx = 1;
		gbc.gridy = 1;
		panel.add(decimalEntry, gbc);
		
		//Add button and action listener
		gbc.gridx = 1;
		gbc.gridy = 2;
		panel.add(b1, gbc);
		b1.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				//Get input from user
				String userInput = binaryEntry.getText();
				input = Long.toString(parseBinary(userInput));
				checkInput = Integer.parseInt(input);
				System.out.println(checkInput);
				if (checkInput !=0 ) {
					decimalEntry.setText(input);					
				} else {
					decimalEntry.setText("Not a Binary Number!");					
				}
			}
		});
		
		//create frame and set visible
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Assignment2();
			}
		});
	}
}