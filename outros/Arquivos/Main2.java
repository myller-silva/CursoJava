public class Main2{

  public static void main(String[] args) throws java.io.IOException {
    int inicio = 544;
    int fim = 618;

    for (int i = inicio; i <= fim; i++) {
      java.io.File arq_old = new java.io.File("supreme-magus-capitulo-"+i+"-centralnovel.com.pdf");
      java.io.File arq_new = new java.io.File(i+".pdf");
      
      if (arq_new.exists()) throw new java.io.IOException("arquivo "+arq_new+" existe");
      
      boolean success = arq_old.renameTo(arq_new);
      if (success) System.out.println(i+" Arquivo renomeado com sucesso");
      else System.out.println(i+" Arquivo nao renomeado");
    }
  }

}