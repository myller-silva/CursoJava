package pacote;

public class Cliente {
    private String nome;
    private String cpf;
    private int idade;
    private Data nascimento;

    public Cliente(String nome, int dia, int mes, int ano){
        this.nome = nome;
        Data nasc = new Data(dia, mes, ano);
        this.nascimento = nasc;
        this.idade = 2021-ano;
    }
    public Cliente(String nome, String cpf, int dia, int mes, int ano){
        this(nome, dia, mes, ano);
        this.cpf = cpf;
    }
    public Cliente(String nome, Data nascimento){
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String toString(){
        String dat;
        dat = String.format("Client: %s\n", nome);
        dat += String.format("CPF: %s\n", cpf);
        dat += String.format("Idade: %d\n", idade);
        dat += String.format("Nascimento: %s\n", nascimento);
        return dat;
    }

}


