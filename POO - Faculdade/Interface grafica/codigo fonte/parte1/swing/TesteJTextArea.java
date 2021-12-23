package swing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class TesteJTextArea extends JFrame {
	
	public TesteJTextArea() {
		setTitle("TesteJTextArea");
		setSize(350,200);
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
		JLabel lbPergunta = new JLabel("Quais suas linguagens de programação preferidas?");
		JTextArea taOpcoes = new JTextArea(6,20);
		//taOpcoes.setLineWrap(true);
		JScrollPane pane = new JScrollPane(taOpcoes);
		JButton btMostrar = new JButton("Mostre-me quais opções escolhi!");
		// Configurar eventos
		btMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resultado = "Opções informadas:\n";
				resultado += taOpcoes.getText();
				JOptionPane.showMessageDialog(null, resultado);
			}
		});
		// Adicionar componenentes
		add(lbPergunta);
		add(pane);
		add(btMostrar);
	}

	public static void main(String[] args) {
		new TesteJTextArea();
	}

}
