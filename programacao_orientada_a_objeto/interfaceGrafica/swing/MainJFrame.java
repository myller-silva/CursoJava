
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MainJFrame extends JFrame {
	
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
	
	public MainJFrame() {
		setTitle("Calculadora MDC");
		setSize(300,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
		setVisible(true);
	}
	
	private void initComponents() {
		// Configurar layout
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		// R�tulos
		lbNumeroUm = new JLabel("N�mero 1:");
		lbNumeroDois = new JLabel("N�mero 2:");
		lbResultado = new JLabel("Resultado:");
		// Campos de texto
		tfNumeroUm = new JTextField();
		tfNumeroDois = new JTextField();
		tfResultado = new JTextField();
		tfResultado.setEditable(false);
		// Bot�es
		btCalcular = new JButton("Calcular");
		btSair = new JButton("Sair");
		// Adicionar componentes
		add(lbNumeroUm); add(lbNumeroDois); add(lbResultado);
		add(tfNumeroUm); add(tfNumeroDois); add(tfResultado);
		add(btCalcular); add(btSair);
		// Configurar posi��es dos componentes
		lbNumeroUm.setBounds(10, 10, 70, 10);
		lbNumeroDois.setBounds(10, 35, 70, 10);
		lbResultado.setBounds(10, 60, 70, 10);
		tfNumeroUm.setBounds(80, 9, 195, 17);
		tfNumeroDois.setBounds(80, 34, 195, 17);
		tfResultado.setBounds(80, 59, 195, 17);
		btCalcular.setBounds(10, 85, 125, 20);
		btSair.setBounds(150, 85, 125, 20);
		// Configurar eventos
		ManipuladoraDeEventos me = new ManipuladoraDeEventos();
		btCalcular.addActionListener(me);
		btSair.addActionListener(me);
		tfNumeroUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfNumeroDois.requestFocus();
			}
		});
		tfNumeroDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btCalcular.doClick();
			}
		});
	}
	
	private class ManipuladoraDeEventos implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource().equals(btCalcular)) {
				try {
					int x = Integer.parseInt(tfNumeroUm.getText());
					int y = Integer.parseInt(tfNumeroDois.getText());
					Calculadora calc = new Calculadora();
					int resultado = calc.mdc(x, y);
					tfResultado.setText(""+resultado);
				} catch(NumberFormatException nfe) {
					JOptionPane.showMessageDialog(null, "Voc� deve informar apenas n�meros inteiros");
					tfNumeroUm.setText("");
					tfNumeroDois.setText("");
					tfResultado.setText("");
					tfNumeroUm.requestFocus();
				}
				
			} else if (e.getSource().equals(btSair)) {
				dispose();
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new MainJFrame();	
	}

}
