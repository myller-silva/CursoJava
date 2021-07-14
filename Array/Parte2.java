import java.util.Scanner;

public class Parte2 {
    public static void main(String[] args){        
        final int tam = 5;

        Scanner scan = new Scanner(System.in) ;

        char[] gabarito = {'a', 'e', 'c', 'd', 'd'};
        char[] resposta = new char[tam];
        int nota=0;

        for(int c=0; c<tam; c++){
            System.out.printf("Questao %d: ", c+1);     
            resposta[c] = scan.nextLine().charAt(0);    //  ler char
        }

        for(int c=0; c<gabarito.length; c++){
            if( resposta[c] == gabarito[c]){
                nota++;
            }
        }

        System.out.printf("Nota: %d\n", nota);

    }
}
