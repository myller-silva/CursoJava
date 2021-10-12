public class Programa {
    public static void main(String[] args){
        Conta conta1 = new Conta();
        Cliente cliente1 = new Cliente();

        cliente1.cpf = "07409841362";
        cliente1.nome = "mac myller";
        cliente1.sobrenome = "da silva carlos";

        conta1.titular = cliente1;
        Data dataDeAbertura = new Data();
        conta1.dataDeAbertura = dataDeAbertura;
        dataDeAbertura.preencher();
        conta1.saldo = 1400;
        
        // conta1.exibir_dados();
        System.out.println( conta1.dataDeAbertura.formatada() );
        
    }
}
