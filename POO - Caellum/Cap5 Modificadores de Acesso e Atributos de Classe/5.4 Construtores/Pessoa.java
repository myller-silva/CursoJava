class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private float peso;

    Pessoa(String nome){
        System.out.println("Um objeto do tipo Pessoa foi criado");
        this.nome = nome;
    }

    String getNome(){
        return this.nome;        
    }


}
