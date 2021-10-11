public class Programa {
    public static void main(String[] args){
        Conta minhaconta = new Conta();
        minhaconta.titular = "mac myller da silva carlos";
        minhaconta.numero = 12021999;
        minhaconta.saldo = 422.28;    

        if( !minhaconta.sacar(2000) ){
            System.out.println("Erro ao sacar");
        }
        minhaconta.depositar(1073.8);        
        System.out.println("Saldo: R$" + minhaconta.saldo);
        
        Conta c2 = minhaconta;
        c2.sacar(1000);
        System.out.println("\n\nSaldo da minha conta:\tR$" + minhaconta.saldo);
        System.out.println("Saldo da conta c2:\tR$" + c2.saldo);
        
    }    
}
