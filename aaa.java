package a;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.DropMode;

public class aaa {

	public JFrame frame;
	private JTextField textField_2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aaa window = new aaa();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public aaa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 692, 491);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(89, 57, 521, 161);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 521, 161);
		panel.add(textArea);
		
		JTextArea txtrFasdasdjSajdhjsadhSd = new JTextArea();
		txtrFasdasdjSajdhjsadhSd.setForeground(new Color(255, 255, 255));
		txtrFasdasdjSajdhjsadhSd.setEditable(false);
		txtrFasdasdjSajdhjsadhSd.setBackground(new Color(0, 0, 0));
		txtrFasdasdjSajdhjsadhSd.setWrapStyleWord(true);
		txtrFasdasdjSajdhjsadhSd.setLineWrap(true);
		txtrFasdasdjSajdhjsadhSd.setText("fasdasdj sajdhjsadh sd hasjdh sajd sjhdjshd jsadhajshdjs dsjhdjhjh jd sajdhjshd sjhdjashdjshd sj djsadjshd");
		txtrFasdasdjSajdhjsadhSd.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
		txtrFasdasdjSajdhjsadhSd.setBounds(10, 10, 490, 111);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(189, 226, 296, 178);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(Color.BLACK);
		
		JButton button_1 = new JButton("New button");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(54, 29, 187, 50);
		panel_1.add(button_1);
		
		JButton button = new JButton("New hbjhbhjb");
		button.setBounds(54, 105, 187, 50);
		panel_1.add(button);
		button.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(0, 0, 0));
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		textField_2.setForeground(new Color(255, 255, 255));
		textField_2.setBackground(new Color(0, 0, 0));
		textField_2.setBounds(554, 28, 33, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		
		
		

		
		
	}
}
