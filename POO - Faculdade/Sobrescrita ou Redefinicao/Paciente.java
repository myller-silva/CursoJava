public class Paciente extends Pessoa {
    String doenca;
    String medicacao;
    boolean sentindoDor; // Um paciente pode sentir dor
    boolean alta; // Um paciente pode ter alta
    Paciente(){
        
    }
    Paciente(String nome, String endereco, int idade, String cpf, String sexo, boolean podeAndar, String doenca, String medicacao, boolean sentindoDor, boolean alta ){
        super(nome, endereco, idade, cpf, sexo, podeAndar);
        this.doenca = doenca;
        this.medicacao = medicacao;
        this.sentindoDor = sentindoDor;
        this.alta = alta;
    }

    public void imprimirValores(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Endereço: "+ this.endereco);
        System.out.println("Idade: "+ this.idade);
        System.out.println("CPF: "+ this.cpf);
        System.out.println("Sexo: "+ this.sexo);
        System.out.println("pode andar: "+ ((this.podeAndar) ? " sim" : "nao") );
        System.out.println("Doenca: "+ this.doenca);
        System.out.println("Medicacao: "+ this.medicacao);
        System.out.println("Sentindo dor: "+ ((this.sentindoDor) ? " sim" : "nao") );
    }
}
