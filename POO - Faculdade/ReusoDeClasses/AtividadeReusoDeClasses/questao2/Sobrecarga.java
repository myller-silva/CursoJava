
public class Sobrecarga{
    public static void main(String[] args) {
        int n1 = 1;
        double d1 = 2.2;
        String nome = "mac";

        Exemplos ex = new Exemplos();
        ex.exibirParametro(n1);
        ex.exibirParametro(d1);
        ex.exibirParametro(nome);
        // isso é sobrecarga: a possibilidade de implementar varios metodos com o mesmo identificador, mas parametros diferentes.
    }
}
