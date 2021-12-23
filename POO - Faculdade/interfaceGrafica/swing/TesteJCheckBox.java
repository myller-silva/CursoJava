
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TesteJCheckBox extends JFrame {
	
	public TesteJCheckBox() {
		setTitle("TesteJCheckBox");
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
		JLabel lbPergunta = new JLabel("Quais suas linguagens de programa��o preferidas?");
		JCheckBox cbAssembly = new JCheckBox("Assembly");
		JCheckBox cbC = new JCheckBox("C");
		JCheckBox cbPlusPlus = new JCheckBox("C++");
		JCheckBox cbJava = new JCheckBox("Java");
		JCheckBox cbPHP = new JCheckBox("PHP");
		JButton btMostrar = new JButton("Mostre-me quais op��es escolhi!");
		// Configurar eventos
		btMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resultado = "Op��es selecionadas:\n";
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
		new TesteJCheckBox();
	}

}
