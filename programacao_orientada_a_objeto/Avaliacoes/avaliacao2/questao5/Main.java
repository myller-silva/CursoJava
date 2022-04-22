import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int dia=0;
        int mes=0;
        int ano=0;
        boolean continua=false;
        do{
            try{
                do{
                    try{
                        System.out.print("Dia: ");
                        dia = scan.nextInt();
                        break;
                    }catch(Exception e){
                        System.out.println("Erro no dia. Tente novamente");
                        scan.nextLine();
                    }
                }while(true);

                do{
                    try{
                        System.out.print("Mes: ");
                        mes = scan.nextInt();
                        break;
                    }catch(Exception e ){
                        System.out.println("Erro no mes. Tente novamente");
                        scan.nextLine();
                    }
                }while(true);

                do{
                    try{
                        System.out.print("Ano: ");
                        mes = scan.nextInt();
                        break;
                    }catch(Exception e ){
                        System.out.println("Erro no ano. Tente novamente");
                        scan.nextLine();
                    }
                }while(true);

                String dataRecebida = String.format("%d/%d/%d", dia, mes, ano); 
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
                Date data = formato.parse(dataRecebida);
                System.out.println("Data: "+data);

            }catch(Exception e){
                System.out.println("Erro ao ler data. Tente novamente.");
                continua = true;
            }
        }while(continua);
	}
}
