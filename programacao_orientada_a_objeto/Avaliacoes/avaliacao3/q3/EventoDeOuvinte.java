package q3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.FlowLayout;

public class EventoDeOuvinte extends JFrame {

    EventoDeOuvinte(){
        // titulo
        setTitle("Evento de ouvinte");
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
        JLabel msg = new JLabel("Clique no botao para acionar um evento!");
        // botao:
        JButton btn = new JButton("clique aqui");
        // configurar evento:
        btn.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String eventMenssage = "Usuário clicou no botão";
                JOptionPane.showMessageDialog(null, eventMenssage);
            }
        });
        // adicionar componentes:
        add(msg);
        add(btn);
    }

    public static void main(String[] args) {
        EventoDeOuvinte teste = new EventoDeOuvinte();
    }
}
