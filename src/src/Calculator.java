package src;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Calculator {

	private JFrame frame;
	private JTextField vvod_a;
	private JTextField vvod_b;
	private JLabel result;
	
	int operat=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
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
		
		vvod_a = new JTextField();
		vvod_a.setBounds(25, 25, 86, 20);
		frame.getContentPane().add(vvod_a);
		vvod_a.setColumns(10);
		
		vvod_b = new JTextField();
		vvod_b.setBounds(134, 25, 86, 20);
		frame.getContentPane().add(vvod_b);
		vvod_b.setColumns(10);
		
		JLabel operation = new JLabel("+");
		operation.setBounds(115, 28, 9, 14);
		frame.getContentPane().add(operation);
		
		JLabel label_1 = new JLabel("=");
		label_1.setBounds(230, 28, 9, 14);
		frame.getContentPane().add(label_1);
		
		JButton Calc = new JButton("=");
		Calc.setBounds(305, 56, 93, 70);
		Calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a,b;
				try {					
					String str = vvod_a.getText(); 
					a  = Double.parseDouble(str); 
					str = vvod_b.getText(); 
					b  = Double.parseDouble(str);
					double r=0;
				
				switch (operat){
				case 0:r=a+b;break;
				case 1:r=a-b;break;
				case 2:r=a*b;break;
				case 3:r=a/b;break;
				}
				
				String s=""+r;
				result.setText(s);
				
				} catch (Exception ex) {
					result.setText(ex.getMessage()); 
					return;
				}
				
				
			}
		});
		frame.getContentPane().add(Calc);
		
		
		result = new JLabel("");
		result.setBounds(249, 25, 98, 20);
		frame.getContentPane().add(result);
		
		JButton ButtonPlus = new JButton("+");
		ButtonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operat = 0;
				operation.setText("+");
			}
		});
		ButtonPlus.setBounds(22, 69, 115, 20);
		frame.getContentPane().add(ButtonPlus);
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operat = 1;
				operation.setText("-");
			}
		});
		button.setBounds(25, 101, 117, 29);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("/");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operat = 3;
				operation.setText("/");
			}
		});
		button_1.setBounds(20, 142, 117, 29);
		frame.getContentPane().add(button_1);
		
		
		
	
		
	}
}