package a;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class aaaa {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aaaa window = new aaaa();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @wbp.parser.entryPoint
	 */
	public aaaa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 700, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(29, 10, 627, 279);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JTextArea textoLabel = new JTextArea();
		textoLabel.setLineWrap(true);
		textoLabel.setWrapStyleWord(true);
		textoLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		textoLabel.setForeground(Color.red);
		textoLabel.setBackground(Color.black);
		textoLabel.setText(
				"Você acordou em uma casa no meio da floresta[...]\r\na ultima coisa que se lembra é de ser empurrado no trilho de um trem.\r\nSeu único objetivo é conseguir o cristal mágico que o levará de volta a sua vida que está com a guardiã a sua frente.\r\nEla lhe propõe um favor em troca de outro: \r\nVocê precisa roubar um item mágico para ela e em troca lhe dará a passagem de volta para casa.\r\nPara esse desafio, 40 pontos de vida (HP) lhe serão concedidos, Boa sorte :)\r\n");
		textoLabel.setBounds(0, 5, 597, 323);
		textoLabel.setEditable(false);
		panel.add(textoLabel);

		JButton botaoContinuar = new JButton("Ir a caça");
		botaoContinuar.setFont(new Font("Times New Roman", Font.PLAIN, 31));
		botaoContinuar.setForeground(Color.white);
		botaoContinuar.setBackground(Color.black);
		botaoContinuar.setBounds(229, 312, 219, 61);
		frame.getContentPane().add(botaoContinuar);

	}

}
