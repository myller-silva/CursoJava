import java.security.SecureRandom;

public class ValoresAleatorios {
    public static void main(String[] args){

        final int lin=3, col=3;
        int[][] matriz = new int[lin][col];
        

        for(int l=0; l<lin; l++){
            for(int c=0; c<col; c++){
                matriz[l][c] = new SecureRandom().nextInt(100); //gerar valores aleatórios no intervalo [0, 99]
            }
        }
        
        System.out.printf("\n");
        for(int[] n:matriz){
            for(int v:n){
                System.out.printf("%d\t", v);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }
}
