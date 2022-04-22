package outros.tabela_hash;

public class Aluno {
  private int ra;
  private String nome;

  
  Aluno(){
    this.ra = -1;
    this.nome="";
  }
  Aluno(int ra, String nome){
    this.ra = ra;
    this.nome = nome;
  }
  public int getRa() {
    return ra;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return ("["+ra+" "+nome+"]");
  }
  
}
