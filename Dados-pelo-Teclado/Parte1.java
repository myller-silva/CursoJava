import java.util.Scanner; //ler pelo teclado

public class Parte1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        // criacao de um objeto da classe Scanner e instanciação desse objeto
        // ou seja, declaracao do objeto e instanciacao desse objeto
        int n1, n2, resp;
        n1 = n2 = resp = 0;
        System.out.print("Primeiro valor: ");
        n1 = scan.nextInt();
        System.out.print("Segundo valor: ");
        n2 = scan.nextInt();
        resp = n1+n2;
        System.out.printf("%d + %d = %d\n", n1, n2, resp);  
    }
}