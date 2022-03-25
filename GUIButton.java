package GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
	
	private	int count = 0;
	private	JLabel label;
	private	JFrame Frame;
	private	JPanel panel;

	public GUI() {
		
		JFrame Frame = new JFrame();
		
		JButton button = new JButton("Click me");
		button.addActionListener(this);
		
		label = new JLabel("Number of clicks: 0");
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		
		Frame.add(panel, BorderLayout.CENTER);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setTitle("Our GUI");
		Frame.pack();
		Frame.setVisible(true);
	
	}
		public static void main(String[] args) {
		new GUI();

	}
		@Override
		public void actionPerformed(ActionEvent e) {
			count++;
			label.setText("Number of clicks: " + count);
		
		}

}
