public class Conta{
    int numero;
    Cliente titular;
    double saldo;

    boolean sacar(double valor){
        if(valor<=this.saldo){            
            double novo_saldo = this.saldo - valor;  
            this.saldo = novo_saldo;
            return true;
        }
        return false;
    }

    void depositar(double valor ){
        this.saldo += valor; 
    }

    boolean transferir_para( Conta destino, double valor ){
        // if(valor<=this.saldo){
        //     destino.saldo += valor;
        //     this.saldo -= valor;
        // }
        if( !this.sacar(valor) ){
            return false;
        }else{
            destino.depositar(valor);
            return true;
        }
    }
    void exibir_dados(){
        System.out.printf("Numero: %d\n", this.numero);
        System.out.printf("Titular: %s\n", this.titular.nome);
        System.out.printf("Saldo: R$%.2f\n", this.saldo);
                
    }



}

class Cliente{
    String nome;
    String sobrenome;
    String cpf;
}