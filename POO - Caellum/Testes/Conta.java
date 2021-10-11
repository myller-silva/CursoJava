public class Conta{
    int numero;
    String titular;
    double saldo;

    boolean sacar(double valor_a_sacar){
        if(valor_a_sacar<=this.saldo){            
            double novo_saldo = this.saldo - valor_a_sacar;  
            this.saldo = novo_saldo;
            return true;
        }
        return false;
    }

    void depositar(double valor_a_depositar){
        this.saldo += valor_a_depositar; 
    }

}