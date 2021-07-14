public class Percorrer{
    public static void main(String[] args){
        final int lin=3;
        final int col=3;
        int[][] matriz = new int[lin][col]; //declaração

        // 1ª forma:
        for(int l=0; l<lin; l++){
            for(int c=0; c<col; c++ ){
                System.out.printf("%d\t", matriz[l][c] );
            }
            System.out.println("");
        }

        System.out.println("");
        
        // 2ª forma:
        for(int[] l:matriz){
            for(int v:l){
                System.out.printf("%d\t", v );
            }
            System.out.println("");
        }
    }
}