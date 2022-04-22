public class Produto{
    private String nome;
    private String descricao;
    private double preco;

    Produto(String nome, String descricao, double preco){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void equals(){

    }

    public String toString(){
        
        return "Produto: " + this.nome+", "+this.descricao + "\nPreço: R$" + this.preco ;
    }

}