public class Teste {
    public static void main(String[] args) {
        Casa minhaCasa = new Casa();
        minhaCasa.cor = "cinza";
        
        minhaCasa.porta1.abre();
        minhaCasa.porta2.abre();
        minhaCasa.porta3.abre();

        System.out.println(minhaCasa.quantasPortasEstaoAbertas() + " porta(s) esta/estao aberta(s)");

    }
}
