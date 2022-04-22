package AtividadeInterfacegrafica;

// import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaDeLogin extends JFrame {
    String[] usuariosCadastrados = new String[] {
        "fulano", "beltrano", "admin"
    };
    String[] senhasCadastradas = new String[] {
        "ful35", "tran40", "sal1000"
    };
    // rotulos:
    JLabel lbusuario = new JLabel("Usuario: ");
    JLabel lbsenha = new JLabel("Senha: ");
    // campo de texto:
    JTextField tfusuario = new JTextField();
    JPasswordField tfsenha = new JPasswordField();
    // botoes:        
    JButton btnLogin = new JButton("Login");
    JButton btnSair = new JButton("Sair");
    
    JanelaDeLogin(){
        setTitle("Autenticação");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // redmensionar janela:
        setResizable(false);
        // iniciar componente:
        initComponents();
        setVisible(true);
    }

    private void initComponents() {     
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
        // local de aparecimento da janela:
        setLocationRelativeTo(null);
        // adicionar elementos:
        add(lbusuario); add(tfusuario);
        add(lbsenha); add(tfsenha);
        add(btnLogin); add(btnSair);
        // configurar posicoes:        
		lbusuario.setBounds(10, 10, 70, 10);
		lbsenha.setBounds(10, 35, 70, 10);
		tfusuario.setBounds(80, 9, 195, 17);
		tfsenha.setBounds(80, 34, 195, 17);
		btnLogin.setBounds(10, 85, 125, 20);
		btnSair.setBounds(150, 85, 125, 20);
        // configurar eventos:
        // passar do campo de usuario para campo de senha:
        tfusuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfsenha.requestFocus();
			}
		});
        // evento no campo de senha:
		tfsenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLogin.doClick();
			}
		});
        // evento no botao de login:
        btnLogin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(estaCadastrado( tfusuario.getText(), tfsenha.getPassword())){
                    JOptionPane.showMessageDialog(null, "Login efetuado com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario ou senha incorreto", "Falha na autenticacao", JOptionPane.ERROR_MESSAGE);
                }
			}
            private boolean estaCadastrado(String usuario, char[] senha){
                String strSenha = String.valueOf(senha);
                for(int c=0; c<usuariosCadastrados.length; c++){
                    if( usuariosCadastrados[c].equals(usuario) && senhasCadastradas[c].equals(strSenha) ){                        
                        return true;
                    }
                }
                return false;
            }

        });
        // evento no botao de sair:
        btnSair.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                dispose();
			}
        });
    }
    public static void main(String[] args) {
        JanelaDeLogin login = new JanelaDeLogin();
    }
}
