
import javax.swing.JOptionPane;

public class TesteJOptionPane {
	
	public static void main(String[] args) {
		
		boolean continua = true;
		
		while (continua) {
			
			String xStr = JOptionPane.showInputDialog(null,
					"Informe um valor inteiro:", "Calculadora MDC", JOptionPane.QUESTION_MESSAGE);
			
			String yStr = JOptionPane.showInputDialog(null,
					"Informe outro valor inteiro:", "Calculadora MDC", JOptionPane.QUESTION_MESSAGE);
			
			int x = Integer.parseInt(xStr);
			int y = Integer.parseInt(yStr);
			
			Calculadora calc = new Calculadora();
			int resultado = calc.mdc(x, y);
			
			JOptionPane.showMessageDialog(null,
					"O MDC de "+xStr+" e "+yStr+" � igual a "+resultado,
					"Calculadora MDC", JOptionPane.INFORMATION_MESSAGE);
			
			int opcao = JOptionPane.showConfirmDialog(null,
					"Voc� deseja calcular outro MDC?",
					"Calculadora MDC", JOptionPane.YES_NO_OPTION);
			
			if (opcao!=JOptionPane.YES_OPTION) {
				continua = false;
			}
			
		}
		
	}

}
