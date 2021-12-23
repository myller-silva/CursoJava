package swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class TesteJTable extends JFrame {
	
	public TesteJTable() {
		setTitle("TesteJTable");
		setSize(500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setResizable(false);
		initComponents();
		setVisible(true);
	}
	
	private void initComponents() {
		// Configurar layout
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		// Criar componentes
		String[] nomesColunas = new String[] {
			"Nome", "Idade", "CPF"
		};
		String[][] dados = new String[][] {
			{"Gustavo", "19", "000.000.000-00"},
			{"Luiz", "19", "111.111.111-11"},
			{"Klayver", "20", "222.222.222-22"},
		};
		DefaultTableModel model = new DefaultTableModel(dados, nomesColunas);
		JTable tPessoas = new JTable(model);
		JScrollPane pane = new JScrollPane(tPessoas);
		// Adicionar componenentes
		add(pane);
	}

	public static void main(String[] args) {
		new TesteJTable();
	}

}
