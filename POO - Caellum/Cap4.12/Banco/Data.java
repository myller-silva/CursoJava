import java.util.Scanner;

class Data {
    int dia;
    int mes;
    int ano; 
    Scanner scan = new Scanner( System.in );
    
    void preencher(){
        System.out.println("Dia: ");
        this.dia = scan.nextInt();
        System.out.println("Mes: ");
        this.mes = scan.nextInt();
        System.out.println("Ano: ");
        this.ano = scan.nextInt();      
    }

    String formatada(){
        return String.format("%2d/%2d/%4d", dia, mes, ano);
    }
}
