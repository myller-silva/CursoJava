import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;


public class Main2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        Date data;
        do{
            try{
                data = lerData();
                break;
            }catch(Exception e){
                System.out.println("Erro ao ler data. Tente novamente");
            }            
        }while(true);
        System.out.println("Data: "+ data);

	}    

    public static Date lerData() throws Exception{
        Scanner scan = new Scanner(System.in);
        int dia=0;
        int mes=0;
        int ano=0;

        System.out.print("Dia: ");
        dia = scan.nextInt();
        scan.nextLine();
        System.out.print("Mes: ");
        mes = scan.nextInt();
        scan.nextLine();
        System.out.print("Ano: ");
        ano = scan.nextInt();
        scan.nextLine();

        String dataRecebida = String.format("%d/%d/%d", dia, mes, ano); 
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        Date data = formato.parse(dataRecebida);
        return data;
    }
}
