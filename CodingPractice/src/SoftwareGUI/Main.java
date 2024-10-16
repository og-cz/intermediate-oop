package SoftwareGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		
		new launchPage("AMT Solution");
	}

}

class launchPage extends JFrame {
	
	JPanel leftPanel;
	JPanel mainPanel;
	JButton submitButton;
	JTextField textField;
	
	public launchPage(String title) {
		
		// window characteristics
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false); 
		this.setSize(new Dimension(700, 500));
		this.setLayout(new FlowLayout());
		
		// Backgrounds gui
		leftPanel = new JPanel();
		leftPanel.setBackground(Color.DARK_GRAY);
		leftPanel.setBounds(0, 0, 190, 500);
		leftPanel.setLayout(new BorderLayout());
		
		mainPanel = new JPanel();
		mainPanel.setBackground(Color.GRAY);
		mainPanel.setBounds(190, 0, 610, 500);
		mainPanel.setLayout(new BorderLayout());
		
		// textfields
		textField.setPreferredSize(new Dimension(250,40));
		textField.setFont(new Font("Consolas",Font.PLAIN,35));
		textField = new JTextField("Usernames");
		textField.setForeground(new Color(0x00FF00));

		textField.setForeground(Color.BLUE);
        textField.setBackground(Color.WHITE);
        textField.setCaretColor(Color.BLUE);

		
		
		
		this.setLayout(null); 
		this.add(textField);
		this.add(mainPanel);
		this.add(leftPanel);
		this.pack();
		this.setVisible(true);
	}
	
}
