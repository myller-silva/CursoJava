
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MinhaSegundaJanela extends JFrame {
	
	public MinhaSegundaJanela() {
		setTitle("Minha segunda janela");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		initComponents();
		setVisible(true);
	}
	
	private void initComponents() {
		JLabel label = new JLabel("Hello World!");
		add(label);
	}
	
	public static void main(String[] args) {
		new MinhaSegundaJanela();
	}

}
