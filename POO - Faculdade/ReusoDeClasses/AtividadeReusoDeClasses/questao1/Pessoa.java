public class Pessoa {
    String nome; //composicao
    String cpf;  //composicao
    
    Pessoa(String nome, String cpf){
        System.out.println("Uma nova pessoa foi criada");
        this.nome = nome;
        this.cpf = cpf;
    }
    
}
