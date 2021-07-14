import java.util.Arrays;

public class Equals {
    public static void main(String[] args){
        final int tam=3;
        int[] n1={0, 0, 0};
        int[] n2=new int[tam];

        System.out.print("\nn1: ");
        for(int n:n1){
            System.out.printf("%d ", n);
        }
        System.out.print("\nn2: ");
        for(int n:n2){
            System.out.printf("%d ", n);
        }

        // Arrays.equals(a, a2) //verifica se os array "a" e "a2" sao iguais; se sim, retorna true, senao retorna false
        System.out.printf("\nn1 = n2 ? %s\n\n", Arrays.equals(n1, n2) ? "sim" : "nao" );
        // nesse caso, n1 é igual n2 pq o java por padrao inicializou n2 com 0 em todas posicoes;
    }
}
