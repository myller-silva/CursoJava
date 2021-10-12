class Conta{
    String titular;
    int numero;
    String agencia;
    double saldo;
    String data_de_abertura;

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

}