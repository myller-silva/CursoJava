public class Conta{
    int numero;
    String titular;
    private double saldo;
    int dataDeAbertura;

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
    
    String dadosFormatados(){
        String dados = new String();
        dados = String.format("Numero: %d\n", this.numero );
        dados += String.format("Titular: %s\n", this.titular );
        dados += String.format("Saldo: %.2f\n", this.saldo );
        return dados;    
    }



}
