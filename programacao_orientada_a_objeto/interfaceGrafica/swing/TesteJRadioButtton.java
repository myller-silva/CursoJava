
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TesteJRadioButtton extends JFrame {
	
	public TesteJRadioButtton() {
		setTitle("TesteJRadioButton");
		setSize(350,120);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		initComponents();
		setVisible(true);
	}
	
	private void initComponents() {
		// Configurar layout
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		// Criar componentes
		JLabel lbPergunta = new JLabel("Qual sua linguagem de programa��o preferida?");
		JRadioButton cbAssembly = new JRadioButton("Assembly");
		JRadioButton cbC = new JRadioButton("C");
		JRadioButton cbPlusPlus = new JRadioButton("C++");
		JRadioButton cbJava = new JRadioButton("Java");
		JRadioButton cbPHP = new JRadioButton("PHP");
		ButtonGroup bg = new ButtonGroup();
		bg.add(cbAssembly); bg.add(cbC); bg.add(cbPlusPlus);
		bg.add(cbJava); bg.add(cbPHP);
		JButton btMostrar = new JButton("Mostre-me qual op��o escolhi!");
		// Configurar eventos
		btMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resultado = "Op��o selecionada:\n";
				if (cbAssembly.isSelected())
					resultado += "Assembly\n";
				if (cbC.isSelected())
					resultado += "C\n";
				if (cbPlusPlus.isSelected())
					resultado += "C++\n";
				if (cbJava.isSelected())
					resultado += "Java\n";
				if (cbPHP.isSelected())
					resultado += "PHP";
				JOptionPane.showMessageDialog(null, resultado);
				
			}
		});
		// Adicionar componenentes
		add(lbPergunta);
		add(cbAssembly); add(cbC); add(cbPlusPlus); add (cbJava); add(cbPHP);
		add(btMostrar);
	}

	public static void main(String[] args) {
		new TesteJRadioButtton();
	}

}
