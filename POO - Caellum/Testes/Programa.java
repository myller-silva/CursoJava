public class Programa {
    public static void main(String[] args){
        Conta minhaconta = new Conta();
        minhaconta.titular = "mac myller da silva carlos";
        minhaconta.numero = 12021999;
        minhaconta.saldo = 422.28;  
        System.out.println("Saldo anterior ao saque: R$" + minhaconta.saldo);     
        if( !minhaconta.sacar(2000) ){
            System.out.println("Erro ao sacar");
        }
        System.out.println("Saldo posterior ao saque: R$" + minhaconta.saldo);  
        minhaconta.depositar(1073.8);
        System.out.println("Saldo posterior ao deposito: R$" + minhaconta.saldo);


    }
    
}
