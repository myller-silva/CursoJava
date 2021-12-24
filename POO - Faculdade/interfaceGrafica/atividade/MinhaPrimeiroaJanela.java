// janela:
import javax.swing.JFrame;
// elementos:
import javax.swing.JLabel;

public class MinhaPrimeiroaJanela {
    public static void main(String[] args) {
        // criar uma janela:
        JFrame janela = new JFrame("Calculadora MDC");
        // finalizar quando clicar no X:
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // tamanho da janela:
        janela.setSize(400, 300);
        // visibilidade:
        janela.setVisible(true);

        // criar um elemento:
        JLabel elemento1 = new JLabel("Ola, mundo!");
        // adicionar o elemento na janela:
        janela.add(elemento1);


        
        



    }
}
