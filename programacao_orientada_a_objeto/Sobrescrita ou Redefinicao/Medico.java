public class Medico extends Pessoa {
    String crm;
    double salario;
    String especializacao;
    boolean podeDarPlantao; // Um médico pode dar plantão

    Medico(){
        
    }

    Medico(String nome, String endereco, int idade, String cpf, String sexo, boolean podeAndar, String crm, double salario, String especializacao, boolean podeDarPlantao ){
        super(nome, endereco, idade, cpf, sexo, podeAndar);
        this.crm = crm;
        this.salario = salario;
        this.especializacao = especializacao;
        this.podeDarPlantao = podeDarPlantao;
    }

    public void imprimirValores(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Endereço: "+ this.endereco);
        System.out.println("Idade: "+ this.idade);
        System.out.println("CPF: "+ this.cpf);
        System.out.println("Sexo: "+ this.sexo);
        System.out.println("pode andar: "+ ( (this.podeAndar) ? " sim" : "nao") );
        System.out.println("CRM: "+ this.crm);
        System.out.println("Salario: "+ this.salario);
        System.out.println("Especializacao: "+ this.especializacao);
        System.out.println("Pode Dar Plantao: "+ ( (this.podeDarPlantao) ? " sim" : "nao") );
    }
}
