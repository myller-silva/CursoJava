class Conta{
    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataDeAbertura;

    boolean sacar(double valor){
        if( 0<valor && valor<=this.saldo ){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    boolean depositar(double valor){
        if( 0<valor ){
            this.saldo += valor;
            return true;
        }
        return false;
    }

    double calcularRendimento(){
        return this.saldo * 0.1;
    }

    void exibirDados(){
        System.out.printf("\ntitular: %s\n", titular);
        System.out.printf("numero: %s\n", numero);
        System.out.printf("agencia: %s\n", agencia);
        System.out.printf("saldo: %s\n", saldo);
        System.out.printf("data de abertura: %s\n", dataDeAbertura);
    }

}