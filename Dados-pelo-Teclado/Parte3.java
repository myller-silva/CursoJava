import java.util.Scanner;

public class Parte3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n1=0, n2=0, n3=0, n4=0;
        float me=0;
        final int media=7;
        String nome="", sit="";
        
        System.out.print("Nome do aluno: ");
        nome = scan.nextLine();
        System.out.print("Digite o primeiro valor: ");
        n1 = scan.nextInt();
        System.out.print("Digite o segundo valor: ");
        n2 = scan.nextInt();
        System.out.print("Digite o terceiro valor: ");
        n3 = scan.nextInt();
        System.out.print("digite o quarto valor: ");
        n4 = scan.nextInt();
        me = (n1+n2+n3+n4)/4;
        if(me>=media){
            sit = "Aprovado";            
        }else if(me>=4){
            sit = "Recuperacao";
        }else{
            sit = "Reprovado";
        }
        System.out.printf("\nAluno: %s\tMedia: %.2f\t%s\n\n", nome, me, sit);

        scan.close();
    }
}
