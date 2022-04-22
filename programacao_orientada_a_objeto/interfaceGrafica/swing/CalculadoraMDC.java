
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalculadoraMDC extends JFrame {
	
	// R�tulos
	private JLabel lbNumeroUm;
	private JLabel lbNumeroDois;
	private JLabel lbResultado;
	// Campos de texto
	private JTextField tfNumeroUm;
	private JTextField tfNumeroDois;
	private JTextField tfResultado;
	// Bot�es
	private JButton btCalcular;
	private JButton btSair;
	
	public CalculadoraMDC() {
		setTitle("Calculadora MDC");
		setSize(300,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
		setVisible(true);
	}
	
	private void initComponents() {
		// Configurar a janela
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		// Cria��o dos componentes
		lbNumeroUm = new JLabel("N�mero 1:");
		lbNumeroDois = new JLabel("N�mero 2:");
		lbResultado = new JLabel("Resultado:");
		tfNumeroUm = new JTextField();
		tfNumeroDois = new JTextField();
		tfResultado = new JTextField();
		tfResultado.setEditable(false);
		btCalcular = new JButton("Calcular");
		btSair = new JButton("Sair");
		// Configurar posi��es dos componentes
		lbNumeroUm.setBounds(10, 10, 70, 10);
		lbNumeroDois.setBounds(10, 35, 70, 10);
		lbResultado.setBounds(10, 60, 70, 10);
		tfNumeroUm.setBounds(80, 9, 195, 17);
		tfNumeroDois.setBounds(80, 34, 195, 17);
		tfResultado.setBounds(80, 59, 195, 17);
		btCalcular.setBounds(10, 85, 125, 20);
		btSair.setBounds(150, 85, 125, 20);
		// Adicionar componentes na janela
		add(lbNumeroUm); add(lbNumeroDois); add(lbResultado); 
		add(tfNumeroUm); add(tfNumeroDois); add(tfResultado);
		add(btCalcular); add(btSair);
		// Configurar eventos
		ManipuladoraDeEventos me = new ManipuladoraDeEventos();
		btCalcular.addActionListener(me);
		tfNumeroDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btCalcular.doClick();
			}
		});
		tfNumeroUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfNumeroDois.requestFocus();
			}
		});
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		//tfNumeroUm.addActionListener(me);
		//tfNumeroDois.addActionListener(me);
	}
	
	public static void main(String[] args) {
		new CalculadoraMDC();
	}
	
	private class ManipuladoraDeEventos implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			/*if (e.getSource().equals(tfNumeroUm)) {
				tfNumeroDois.requestFocus();
			} else {*/
				String numero1Str = tfNumeroUm.getText();
				String numero2Str = tfNumeroDois.getText();
				int numero1 = Integer.parseInt(numero1Str);
				int numero2 = Integer.parseInt(numero2Str);
				Calculadora calc = new Calculadora();
				int resultado = calc.mdc(numero1, numero2);
				tfResultado.setText(""+resultado);
			//}
		}
		
	}

}
