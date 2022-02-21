package q1;

/**
 *
 * @author Mac Myller,
 * Estudante de Ciencia da Computacao no IFCE campus Maracanau
 *
 */
 
public class Pessoa {
    /**
     * nome da pessoa
     */
    private String nome;
    /**
     *
     * @param nome
     */
    public Pessoa( String nome){
        this.nome = nome;
    }
   
    /**
     *
     * @return nome
     */
    public String getNome(){
        return this.nome;
    }
}
