import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MinhaSegundaJanela extends JFrame{
    MinhaSegundaJanela(){
        // titulo:
        setTitle("minha segunda janela");
        // tamanho:
        setSize(400, 300);
        // fechar janela ao clicar no X:
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // iniciar componentes:
        initComponents();
        // redmensionar janela:
        setResizable(false);
        // visibilidade:
        setVisible(true);
    }
    private void initComponents(){
        // criar componente:
        JLabel label1 = new JLabel("Ola, mundo!");
        // adicionar componente na janela:
        // add(label1);
        // escolher o layout ao adicionar componente:
        add(label1, BorderLayout.LINE_END);
        // manipular largura e altura do componente:
        label1.setBounds(10, 10, 70, 10);
    }


    public static void main(String[] args) {
        MinhaSegundaJanela janela = new MinhaSegundaJanela();
    }

}
