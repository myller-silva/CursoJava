import java.util.Arrays;
public class Fill {
    public static void main(String[] args){
        final int tam=10;           //constante
        int[] num = new int[tam]; 
        
        System.out.println("");
        for(int n:num){
            System.out.printf("%d ", n);
        }

        Arrays.fill(num, 10);       // metodo fill da classe Arrays: preenche todos os espaços do array "num" com o valor "10"

        System.out.println("\n");
        for(int c=0; c<tam; c++){
            System.out.printf("%d ", num[c]);
        }
        System.out.println("\n");
    }
}