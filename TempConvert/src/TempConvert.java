import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TempConvert {
	private int WIDTH = 300;
	private int HEIGHT = 75;
	private JFrame frame;
	private JPanel panel;
	private JLabel inputLabel, resultLabel;
	private JTextField fahrenheit;
	
	
	public TempConvert(){
		frame = new JFrame("Temperature Conversion");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		inputLabel = new JLabel("Enter Fahrenheit Temperature:");
		JLabel outputLabel = new JLabel("Temperature in Celsius:  ");
		resultLabel = new JLabel("---");
		
		fahrenheit = new JTextField(5);
		fahrenheit.addActionListener(new TempListener());
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		panel.setBackground(Color.pink);
		
		panel.add(inputLabel);
		panel.add(fahrenheit);
		panel.add(outputLabel);
		panel.add(resultLabel);
		
		frame.getContentPane().add(panel);
	}
	
	public void display(){
		frame.pack();
		frame.setVisible(true);
	}
	
	private class TempListener implements ActionListener{
		

		@Override
		public void actionPerformed(ActionEvent event) {
			int fahrenheitTemp, celsiusTemp;
			
			String text = fahrenheit.getText();
			
			fahrenheitTemp=Integer.parseInt(text);
			
			celsiusTemp=(fahrenheitTemp-32)*5/9;
			
			resultLabel.setText(Integer.toString(celsiusTemp));
			
		}
	}


public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				TempConvert window = new TempConvert();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}
}