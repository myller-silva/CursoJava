public class TestaConta {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.numero = 12021999;
        minhaConta.titular = "mac";
        // minhaConta.saldo = 10;
        minhaConta.depositar(10);
        minhaConta.dataDeAbertura = 14102021;

        
        System.out.println( minhaConta.dadosFormatados() );

    }
}
