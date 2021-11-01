public class Exemplos{
    void exibirParametro(int valor){
        System.out.printf("O parametro '%d' eh um valor inteiro\n", valor);
    }
    void exibirParametro(double valor){
        System.out.printf("O parametro '%.2f' eh um valor double\n", valor);
    }
    void exibirParametro(String valor){
        System.out.printf("O parametro '%s' eh uma string\n", valor);
    } 
}
