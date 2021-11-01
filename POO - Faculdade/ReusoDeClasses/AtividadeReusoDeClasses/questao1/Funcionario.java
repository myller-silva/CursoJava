public class Funcionario extends Pessoa{
    double salario;    
    Funcionario(String nome, String cpf, double salario){
        super(nome, cpf);
        System.out.println("Um novo funcionario foi criado");
        this.salario = salario;
    }
}
