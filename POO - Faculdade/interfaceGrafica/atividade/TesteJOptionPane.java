import javax.swing.JOptionPane;

public class TesteJOptionPane {
    public static void main(String[] args) {
        String msg = "Calculadora MDC";
        boolean continua=true;

        while(continua){
            // componente pai / mensagem / titulo da mensagem / tipo da mensagem
            String xStr = JOptionPane.showInputDialog(null, "Informe um valor inteiro: ", msg, JOptionPane.QUESTION_MESSAGE);
            String yStr = JOptionPane.showInputDialog(null, "Informe outro valor inteiro: ", msg, JOptionPane.QUESTION_MESSAGE);

            int x, y;
            x = Integer.parseInt(xStr);
            y = Integer.parseInt(yStr);

            Calculadora calc = new Calculadora();

            int resultado = calc.mdc(x, y);
            JOptionPane.showMessageDialog(null, "MDC("+x+","+y+") = "+resultado, "calculadora", JOptionPane.INFORMATION_MESSAGE);
            
            // JOptionPane.showOptionDialog(null, "Deseja continuar?", msg, JOptionPane.YES_NO_OPTION);
            int opcao = JOptionPane.showConfirmDialog(null, "Quer continuar?", msg, JOptionPane.YES_NO_OPTION);
            if( opcao!=JOptionPane.YES_OPTION ){
                continua = false;
            }
        }

    }
}
