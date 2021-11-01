class Pessoa{

    private String nome;

    public Pessoa(){
        this.nome = "joao";
        System.out.println("Pesoa()");
    }

}

class PessoaFisica{

    private int cpf;

    public PessoaFisica(){
        super();
        System.out.println("PessoaFisica() com CPF " + cpf);
        show();        
    }

    public void show(){
        System.out.println("Show PessoaFisica");
    }

}

public class ClientePF extends PessoaFisica{

    private int codCliente;
    
    public ClientePF(){
        this(999);
        System.out.println("ClientePF()");
    }

    public ClientePF(int codCliente){
        super();
        System.out.println("ClientePF("+codCliente+")");
        this.codCliente = codCliente;
        super.show();
    }
    public void show(){
        System.out.println("Show ClientePF");        
    }
    public static void main(String[] args) {
        new ClientePF();
    }

}
