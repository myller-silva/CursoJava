import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        // nomeCompleto e telefone
        Scanner scan = new Scanner( System.in );
        String nome;
        int ddd, numero;
        
        System.out.println("Informe seu nome completo: ");
        nome = scan.nextLine();
        
        System.out.println("Informe seu numero ");

        System.out.print("DDD: ");        
        ddd = scan.nextInt();

        System.out.print("Numero: ");
        numero = scan.nextInt();

        scan.close();





        
    }    
}