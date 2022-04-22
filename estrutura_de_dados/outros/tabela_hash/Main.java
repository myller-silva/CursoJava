package outros.tabela_hash;

import utils_my.Console;

public class Main {
  public static void main(String[] args) {
    Console.limparTela();
    
    Hash hash = new Hash(4, 6);
    
    
    hash.add( new Aluno(7, "myller") );
    hash.add( new Aluno(38, "matheus") );
    hash.add( new Aluno(9, "maria") );
    hash.add( new Aluno(10, "marcos") );

    // hash.pop( new Aluno(4, "") );
    // hash.pop( new Aluno(3, "") );
    // hash.pop( new Aluno(2, "") );
    // hash.pop( new Aluno(1, "") );
    

    System.out.println( hash );
  }
}
