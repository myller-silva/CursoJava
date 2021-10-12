public class Programa {
    public static void main(String[] args){
        Conta minhaconta = new Conta();
        // minhaconta.titular = "mac myller da silva carlos";
        Cliente cliente1 = new Cliente();
        cliente1.cpf = "07409841362";
        cliente1.nome = "mac myller";
        cliente1.sobrenome = "da silva carlos";
        minhaconta.titular = cliente1;
        minhaconta.numero = 12021999;
        minhaconta.saldo = 422.28;   
        minhaconta.depositar(1073.8);   

        Conta c2 = new Conta();
        Cliente cliente2 = new Cliente();
        cliente2.cpf = "93874128427";
        cliente2.nome = "maria eridan";
        cliente2.sobrenome = "da silva";
        c2.titular = cliente2;
        c2.numero = 7051975;
        c2.saldo = 500;

        minhaconta.transferir_para(c2, 1000);
        minhaconta.exibir_dados();
        System.out.println();
        c2.exibir_dados();
        
    }    

    
}
