

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MinhaPrimeiraJanela {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("Minha Primeira Janela");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		
		JLabel label = new JLabel("Hello World");
		frame.add(label);
		
		frame.setVisible(true);
		
		
	}

}
