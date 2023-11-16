package a;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class se {

	private JFrame janela;
	Container con;
	JPanel panel = new JPanel();
	Random rm = new Random();
	String[] Monstros = {"Golem", "Troll", "Basilisco", "Trasgo", "Cérbero", "Minotauro"};
	int HP = 40;
	int HPmonstro = 20;
	int ataqueMax= rm.nextInt(9);
	int ataqueMonstro = rm.nextInt(11);
	
	private JTextField textHP, textHPmonstro;

	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					se window = new se();
					window.janela.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public se() {
		inicioJogo();
	}

	public void inicioJogo() {
		
		
		janela = new JFrame();
		janela.setBounds(100, 100, 692, 491);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.getContentPane().setBackground(Color.black);
		janela.getContentPane().setLayout(null);
		con = janela.getContentPane();
		
		JPanel tituloPanel = new JPanel();
		tituloPanel.setBounds(153, 83, 371, 108);
		tituloPanel.setBackground(Color.BLACK);
		con.add(tituloPanel);
		
		JLabel tituloLabel = new JLabel("NOME DO JOGO");
		tituloLabel.setFont(new Font("Times New Roman", Font.PLAIN, 45));
		tituloLabel.setForeground(Color.WHITE);
		tituloPanel.add(tituloLabel);
		
		JButton botaoStart = new JButton("INICIAR");
		botaoStart.setBounds(221, 239, 235, 57);
		con.add(botaoStart);
		botaoStart.setForeground(Color.white);
		botaoStart.setBackground(Color.black);
		botaoStart.setFont(new Font("Times New Roman", Font.PLAIN, 42));
		botaoStart.setFocusPainted(false);
		
		JButton botaoSair = new JButton("SAIR");
		botaoSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}});
		
		botaoSair.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		botaoSair.setBounds(236, 325, 205, 44);
		con.add(botaoSair);
		botaoSair.setForeground(Color.white);
		botaoSair.setBackground(Color.black);
		botaoSair.setFocusPainted(false);
		

		
		botaoStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tituloLabel.setVisible(false);
				botaoStart.setVisible(false);
				botaoSair.setVisible(false);
				
				
				
				panel.setBackground(Color.black);
				panel.setBounds(30, 52, 624, 237);
				con.add(panel);
				
				JTextArea textoLabel = new JTextArea();
				textoLabel.setLineWrap(true);
				textoLabel.setWrapStyleWord(true); 
				textoLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
				textoLabel.setForeground(Color.white);
				textoLabel.setBackground(Color.black);
				textoLabel.setText("Você acordou em uma casa no meio da floresta[...]\r\na ultima coisa que se "
						+ "lembra é de ser empurrado no trilho de um trem.\r\nSeu único objetivo é conseguir o cristal "
						+ "mágico que o levará de volta a sua vida que está com a guardiã a sua frente.\r\nEla lhe propõe"
						+ " um favor em troca de outro: \r\nVocê precisa roubar um item mágico para ela e em troca lhe dará"
						+ " a passagem de volta para casa.\r\nPara esse desafio, 40 pontos de vida (HP) lhe serão concedidos, Boa sorte :)\r\n");
				textoLabel.setBounds(0, 5, 597, 323);
				textoLabel.setEditable(false);
				panel.add(textoLabel);
				
				
				JButton botaoContinuar = new JButton("continuar");
				botaoContinuar.setFont(new Font("Times New Roman", Font.PLAIN, 31));
				botaoContinuar.setForeground(Color.white);
				botaoContinuar.setBackground(Color.black);
				botaoContinuar.setFocusPainted(false);
				botaoContinuar.setBounds(229, 312, 219, 61);
				con.add(botaoContinuar); 
				
				
				botaoContinuar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {	
						botaoContinuar.setVisible(false);
						int aleatorio = (int) (Math.random() * Monstros.length);
						textoLabel.setText("Você encontrou um  " +Monstros[aleatorio]+ "! o que deseja fazer? ");
						textoLabel.setFont(new Font("Times New Roman", Font.PLAIN, 28));
						textoLabel.setBounds(59, 47, 504, 93);
						
						JButton op1 = new JButton("Atacar");
						op1.setFont(new Font("Times New Roman", Font.PLAIN, 28));
						op1.setForeground(Color.white);
						op1.setBackground(Color.black);
						op1.setBounds(191, 175, 241, 48);
						op1.setVisible(true);
						con.add(op1);
						
						JButton op2 = new JButton("Correr");
						op2.setFont(new Font("Times New Roman", Font.PLAIN, 28));
						op2.setForeground(Color.white);
						op2.setBackground(Color.black);
						op2.setBounds(191, 248, 241, 48);
						op2.setVisible(true);
						con.add(op2);
						
						textHP = new JTextField("seu HP: "+HP);
						textHP.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
						textHP.setBackground(Color.black);
						textHP.setForeground(Color.white);
						textHP.setBounds(83, 362, 193, 40);
						textHP.setBorder(null);
						textHP.setFocusable(false);
						textHP.setVisible(true);
						con.add(textHP);
						
						textHPmonstro = new JTextField("HP do " +Monstros[aleatorio]+": "+HPmonstro);
						textHPmonstro.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
						textHPmonstro.setBackground(Color.black);
						textHPmonstro.setForeground(Color.white);
						textHPmonstro.setBounds(351, 362, 193, 40);
						textHPmonstro.setBorder(null);
						textHPmonstro.setFocusable(false);
						textHPmonstro.setVisible(true);
						con.add(textHPmonstro);
						
							}});
				
			}
			
		});
		
		
	}
	public void ataque() {
		HP = HP-ataqueMonstro;
		HPmonstro = HPmonstro - ataqueMax;
		textHP.setVisible(true);
		textHPmonstro.setVisible(true);
				
	}
}