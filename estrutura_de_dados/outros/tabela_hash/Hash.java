package outros.tabela_hash;

public class Hash {
  private int max_itens;
  private int max_posicoes;
  private int qtd_itens;
  private Aluno[] estrutura;

  Hash(int max_items, int max_posicoes){
    qtd_itens=0;
    this.max_itens = max_items;
    this.max_posicoes = max_posicoes;
    this.estrutura = new Aluno[max_posicoes];
    this.preencher();
  }
  private void preencher() {
    for (int i = 0; i < estrutura.length; i++) {
      estrutura[i] = new Aluno();
    }
  }
  private int funcaoHash(Aluno aluno) {
    return(aluno.getRa() % max_posicoes);
  }
  
  public boolean isFull() {
    return (qtd_itens==max_itens);
  }
  
  public int getTamanho() {
    return this.qtd_itens;
  }

  public boolean add(Aluno aluno) {
    if(isFull()){
      return false;
    }
    estrutura[funcaoHash(aluno)] = aluno;
    qtd_itens++;
    return true;
  }

  public boolean pop(Aluno aluno) {
    if(qtd_itens==0){
      return false;
    }
    int local = funcaoHash(aluno);
    if(estrutura[local]==null){
      return false;
    }
    if(estrutura[local].getRa() != -1){
      estrutura[local] = new Aluno(-2, "");
      qtd_itens--;
      return true;
    }
    return false;
  }

  public boolean buscar(Aluno aluno) { 
    int local = funcaoHash(aluno);
    Aluno aux = estrutura[local];
    if(aluno.getRa()==aux.getRa()){
      aluno = aux;
      // aluno.setNome(aux.getNome());
      return true;
    }
    return false;
  }

  @Override
  public String toString(){
    String str = "";    
    for (int i = 0; i < estrutura.length; i++) {
      Aluno a = estrutura[i];
      if(a != null){
        str += "["+(a.getRa() +" " + a.getNome() +"]\n");
      }else{
        str+= "[ -1 ]\n";
      }
    }
    return str;
  }
  
  public Aluno[] getEstrutura() {
    return estrutura;
  }
}
