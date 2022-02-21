import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.FlowLayout;

public class TesteJCheckBox extends JFrame {

    TesteJCheckBox(){
        // titulo
        setTitle("Check Box");
        // tamanho:
        setSize(315, 120);
        // click do X:
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // ajustabilidade:
        setResizable(false);
        // visibilidade:
        initComponents();
        setVisible(true);
    }

    private void initComponents(){    
        // configurar layout:
        setLayout(new FlowLayout()); 
        // local de aparecimento da janela:
        setLocationRelativeTo(null);

        // criar componentes:
        JLabel pergunta = new JLabel("Quais suas linguagens de programcao preferida?");
        // criar check box:
        JCheckBox assembly = new JCheckBox("Assembly");
        JCheckBox c = new JCheckBox("C");
        JCheckBox java = new JCheckBox("Java");
        JCheckBox cplusplus = new JCheckBox("C++");
        JCheckBox csharpe = new JCheckBox("C#");
        JCheckBox python = new JCheckBox("Python");
        // botao:
        JButton btn = new JButton("Mostre-me quais opcoes escolhi!");
        // configurar evento:      

        btn.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String resultado = "Opcoes selecionadas: \n";
                if(assembly.isSelected()){
                    resultado+="Assembly\n";
                }
                if(c.isSelected()){
                    resultado+= "C\n";
                }
                if(java.isSelected()){
                    resultado+="Java\n";
                }
                if(cplusplus.isSelected()){
                    resultado+="C++\n";
                }
                if(csharpe.isSelected()){
                    resultado+="C#";
                }
                if(python.isSelected()){
                    resultado+="Python";
                }
                JOptionPane.showMessageDialog(null, resultado);
            }
        });
        // adicionar componentes:
        add(pergunta);
        add(assembly);
        add(c);
        add(java);
        add(cplusplus);
        add(csharpe);
        add(python);
        add(btn);
    }

    public static void main(String[] args) {
        TesteJCheckBox teste = new TesteJCheckBox();
    }
}
