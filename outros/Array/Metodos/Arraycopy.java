public class Arraycopy {
    public static void main(String[] args){
        final int tam = 10;
        int[] n1={9, 8, 7 ,3, 2, 4, 6, 5, 1, 0};
        int[] n2 = new int[tam] ;
        
        // System.arraycopy(src, srcPos, dest, destPos, length);
        System.arraycopy(n1, 0, n2, 0, tam); 
        //copia de "n1" a partir do posicao "0" para "n2" a partir da posicao "0" a quantidade de "tam" elementos

        System.out.print("\nn1: ");
        for(int c:n1){
            System.out.printf("%d ", c);
        }

        System.out.print("\nn2: ");
        for(int c:n2){
            System.out.printf("%d ", c);
        }
        System.out.println("\n");
    }
}
