import java.util.Scanner;
public class Cadastro {
    public static void main(String[] args) {

        Scanner scan = new Scanner( System.in );
        String nome=null;
        int ddd, numero; 
        
        while( nome==null ){
            System.out.println("Informe seu nome completo: ");
            nome = scan.nextLine();
        }
        
        System.out.println("Informe seu numero ");   
        while(true){
            try{           
                System.out.print("DDD: ");  
                ddd = scan.nextInt();
                if(100<=ddd){
                    throw new java.util.InputMismatchException("DDD com mais de dois digitos");
                }
                break;
            }catch(java.util.InputMismatchException e){
                System.out.println("Erro, DDD invalido, tente novamente");
                scan.nextLine(); //esvaziar buffer  
            }
        }

        while(true){
            try{           
                System.out.print("Numero: ");  
                numero = scan.nextInt();
                if( numero < 900000000 || 1000000000 <= numero   ){
                    throw new java.util.InputMismatchException("Numero invalido"); 
                }
                break;
            }catch(java.util.InputMismatchException e){
                System.out.println("Erro, Numero invalido, tente novamente");
                scan.nextLine(); //esvaziar buffer  
            }
        }

        scan.close();

        System.out.println("\n\n\nNome: " + nome);
        System.out.printf("Numero: %d %d\n", ddd, numero);
    }    
}