package a;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class bbb {

	JLabel tituloLabel,textHP,textHPmonstro;
	JButton botaoStart, botaoSair, botaoContinuar, op1, op2;
	JPanel tituloPanel, panel, BotaoPanel, PanelHP;
	JFrame janela;
	Container con;
	Random rm = new Random();
	String[] Monstros = {"Golem", "Troll", "Basilisco", "Trasgo", "Cérbero", "Minotauro"};
	int HP = 40;
	int HPmonstro = 20;
	int ataqueMax= rm.nextInt(9);
	int ataqueMonstro = rm.nextInt(11);
	Font Titulo = new Font("Times New Roman", Font.PLAIN, 40);
	Font Gerais = new Font("Times New Roman", Font.PLAIN, 28);
	JTextArea textArea, questArea; 
	String pt, Esfinge;
	int aleatorio = (int) (Math.random() * Monstros.length);
	
	TitleScreenHandler ts = new TitleScreenHandler();
	ChoiceHandler esc = new ChoiceHandler();
	

	

	public static void main(String[] args) {
		new bbb();
	}


	public bbb() {		
		
		janela = new JFrame();
		janela.setBounds(100, 100, 692, 491);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.getContentPane().setBackground(Color.black);
		janela.getContentPane().setLayout(null);
		con = janela.getContentPane();
		
		tituloPanel = new JPanel();
		tituloPanel.setBounds(153, 83, 371, 108);
		tituloPanel.setBackground(Color.BLACK);
		con.add(tituloPanel);
		
		tituloLabel = new JLabel("NOME DO JOGO");
		tituloLabel.setFont(Titulo);
		tituloLabel.setForeground(Color.WHITE);
		tituloPanel.add(tituloLabel);
		
		BotaoPanel = new JPanel();
		BotaoPanel.setBackground(Color.black);
		BotaoPanel.setBounds(100, 206, 478, 219);
		BotaoPanel.setLayout(null);
		con.add(BotaoPanel);

		
		botaoStart = new JButton("INICIAR");
		botaoStart.setBounds(121, 39, 235, 57);
		BotaoPanel.add(botaoStart);
		botaoStart.setForeground(Color.white);
		botaoStart.setBackground(Color.black);
		botaoStart.setFont(Gerais);
		botaoStart.addActionListener(ts);
		botaoStart.setFocusPainted(false);
		botaoStart.setVisible(true);
		BotaoPanel.add(botaoStart);
		
		
		botaoSair = new JButton("SAIR");
		botaoSair.setFont(Gerais);
		botaoSair.setBounds(136, 127, 205, 44);
		BotaoPanel.add(botaoSair);
		botaoSair.setForeground(Color.white);
		botaoSair.setBackground(Color.black);
		botaoSair.setFocusPainted(false);
		botaoSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}});
				
		janela.setVisible(true);	
		
	}

	/*criação e configuração dos botões e tela*/
	public void criacaoTela() {
		botaoStart.setVisible(false);
		botaoSair.setVisible(false);
		tituloPanel.setVisible(false);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(0, 0, 0));
		panel2.setBounds(79, 62, 508, 129);
		janela.add(panel);
		panel2.setLayout(null);
		
		questArea = new JTextArea("area de texto");
		questArea.setLineWrap(true);
		questArea.setWrapStyleWord(true); 
		questArea.setFont(Gerais);
		questArea.setForeground(Color.white);
		questArea.setBackground(Color.black);
		questArea.setBounds(10, 10, 488, 109);
		questArea.setEditable(false);
		panel2.add(questArea);
		
		panel = new JPanel();
		panel.setBounds(10, 10, 628, 323);
		panel.setBackground(Color.black);
		con.add(panel);
		
		textArea = new JTextArea("area de texto");
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true); 
		textArea.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textArea.setForeground(Color.white);
		textArea.setBackground(Color.black);
		textArea.setBounds(0, 5, 597, 323);
		textArea.setEditable(false);
		panel.add(textArea);
		
		
		JPanel choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(136, 201, 401, 178);
		choiceButtonPanel.setBackground(Color.black);
		choiceButtonPanel.setLayout(new GridLayout(4,1));
		con.add(choiceButtonPanel);		
		
		op1 = new JButton("escolha 1");
		op1.setFont(Gerais);
		op1.setForeground(Color.white);
		op1.setBackground(Color.black);
		op1.setBounds(94, 29, 213, 50);
		op1.setFocusPainted(false);
		op1.addActionListener(esc);
		op1.setActionCommand("op1");
		choiceButtonPanel.add(op1);
		
		op2 = new JButton("escolha 2");
		op2.setFont(Gerais);
		op2.setForeground(Color.white);
		op2.setBackground(Color.black);
		op2.setBounds(94, 105, 213, 50);
		op2.setFocusPainted(false);
		op2.addActionListener(esc);
		op2.setActionCommand("op2");
		choiceButtonPanel.add(op2);
		
		
        textHP = new JLabel("seu HP: "+HP);
		textHP.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textHP.setBackground(Color.black);
		textHP.setForeground(Color.white);
		textHP.setBounds(57, 400, 102, 29);
		janela.add(textHP);
        
		
		textHPmonstro = new JLabel("HP do " +Monstros[aleatorio]+": "+HPmonstro);
		textHPmonstro.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textHPmonstro.setBackground(Color.black);
		textHPmonstro.setForeground(Color.white);
		textHPmonstro.setBounds(542, 400, 120, 29);
		janela.add(textHPmonstro);
		
		botaoContinuar = new JButton();
		botaoContinuar.setFont(Gerais);
		botaoContinuar.setForeground(Color.white);
		botaoContinuar.setBackground(Color.black);
		botaoContinuar.setActionCommand("cont");
		botaoContinuar.setFocusPainted(false);
		botaoContinuar.setBounds(229, 312, 219, 61);
		botaoContinuar.addActionListener(ts);
		con.add(botaoContinuar); 

		teste();
	}
public void teste(){
		
    textHP = new JLabel("seu HP: "+HP);
	textHPmonstro = new JLabel("HP do " +Monstros[aleatorio]+": "+HPmonstro);
	PanelHP.setVisible(true);
	textHP.setVisible(true);

		game();
	}
	
	
	public void game() {
		pt = "game";
		
		op1.setVisible(false);
		op2.setVisible(false);
		
		tituloLabel.setVisible(false);
		botaoStart.setVisible(false);
		botaoSair.setVisible(false);
		
		textArea.setText("Você acordou em uma casa no meio da floresta[...]\r\na ultima coisa que se "
				+ "lembra é de ser empurrado no trilho de um trem.\r\nSeu único objetivo é conseguir o cristal "
				+ "mágico que o levará de volta a sua vida");
		
		botaoContinuar.setText("continuar");
				
	}

	
	public void continuar() {
		pt = "continuar";
		
		botaoContinuar.setVisible(false);
		questArea.setText("Você encontrou um  " +Monstros[aleatorio]+ "! o que deseja fazer? ");
		
		op1.setText("lutar");
		op2.setText("correr");
}

	
	
	public void gameOver() {
			pt = "game over";
		
			questArea.setText("Você perdeu! fim de jogo :)");
			
			botaoContinuar.setText("reiniciar jogo");
			botaoSair.setText("terminar por aqui");
			botaoSair.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}});
					
			
	}

	public void vencerMonstro() {
		textArea.setText("Esfinge: parabéns, conseguiu passar pelo "+Monstros[aleatorio]+"\r\njá é alguma coisa..."
				+ "fiquei sabendo que precisa da espada mistica, e posso lhe dar\r\n"
				+ "mas apenas se acertar o meu enigma, o que acha? ");
		
		op1.setText("aceitar desafio");
		op2.setText("atacar esfinge");
	}
	
	public void desafioAceito() {
		textArea.setText("...\r\nBoa escolha. Para responder o enigma, peço que\r\nuse apenas uma palavra, boa sorte.\r\n"
				+ " 'Eu devoro feras, pássaros, flores e árvores.\r\n"
				+ " Eu destruo o mais resistente ferro e desintegro a mais dura rocha, quem sou eu?' ");
	}
	
public class TitleScreenHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			
			criacaoTela();
		}
	}
	
	
	public void ataque() {
		pt = "ataque";
		
		HP = HP-ataqueMonstro;
		HPmonstro = HPmonstro - ataqueMax;
		textHP.setText("seu HP: "+HP);
		textHPmonstro.setText("HP do " +Monstros[aleatorio]+": "+HPmonstro);
		
		op1.setText("atacar");
		op2.setText("correr");
				
		
	}
	
	public void correr() {
		pt = "correr";
		
		
		textArea.setText("[...]\r\nGuardiã: olá novamente, não achei que lhe veria tão cedo\r\n"
				+ "vejo que desistiu do desafio, talvez não queira tanto assim ir para casa\r\n"
				+ "mas lhe darei outra chance caso tenha pensado melhor\r\n[...]");
		
		op1.setText("voltar");
		op2.setText("atacar guardiã");
		
	}
	
	public void prisao() {
		questArea.setText("Guardiã: oh oh, isso foi burrice...\r\nIsso foi muita burrice");
		botaoSair.setText("...");
		botaoSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questArea.setText("você teve seu corpo explodido de dentro para fora");
				System.exit(0);
			}});
				
		
	}
	
	
public class ChoiceHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			String escolhas = event.getActionCommand();
			
			
			switch(pt){
			
			case "game":
				
				switch(escolhas) {
				case "cont" : continuar();
				}
				
			case "continuar" :	
				switch(escolhas) {
				case "op1" : ataque();
				case "op2" : correr();
				}
				
			case "correr" :
				switch(escolhas) {
				case "op1" : continuar();
				case "op2" : prisao();
				}
				
			case "ataque" :
				switch(escolhas) {
				case "op1" : if(HPmonstro>=1) {
					ataque();
				}else {
					vencerMonstro();
				}
				case "op2" : correr();
				}
			}
		}}
	
	
}