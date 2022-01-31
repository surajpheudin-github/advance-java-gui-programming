import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Frame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Frame(String title) {
		super(title);
	}
	
    //Reference Variables
	JLabel title, firstNumber, secondNumber, result;
	JTextField 	firstNumberInput, secondNumberInput;
	JButton addBtn;
	
	public class ButtonClicked implements ActionListener{
		
		// Action to be performed when add button is clicked
		public void actionPerformed(ActionEvent e) {
			try {
			    int a = Integer.parseInt(firstNumberInput.getText());
	            int b = Integer.parseInt(secondNumberInput.getText());
	            int sum = a + b;
	            result.setText("Sum of first and second number is: " + sum);
			}catch (Exception error) {
				// TODO: handle exception
				System.out.println("e " + error );
			}
	
		}
	}
	
	public void setComponent() {
		
		title = new JLabel("Add Two Numbers");
		firstNumber = new JLabel("First Number: ");
		secondNumber = new JLabel("Second Number: ");
		result = new JLabel("");
		
		firstNumberInput = new JTextField();
		secondNumberInput = new JTextField();
		
		addBtn = new JButton("Add");
		
	    //Designing
        this.setLayout(null);
        title.setBounds(10, 50, 200, 20);
        firstNumber.setBounds(10, 100, 100, 20);
        secondNumber.setBounds(10, 130, 100, 20);
        firstNumberInput.setBounds(120, 100, 200, 20);
        secondNumberInput.setBounds(120, 130, 200, 20);
        addBtn.setBounds(10, 170, 100, 20);
        result.setBounds(10, 200, 300, 20);
   
		
		add(addBtn);
		add(title);
		add(firstNumber);
		add(secondNumber);
		add(firstNumberInput);
		add(secondNumberInput);
		add(result);
		
		// Handling Events
		addBtn.addActionListener(new ButtonClicked());
	}
	
}

public class JFrameTutorial {

	public static void main(String[] args) {
		
		Frame window = new Frame("Frame Tutorial");
		window.setVisible(true);
		window.setBounds(0, 0, 500, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setComponent();
	}
}
