import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] n={9, 5, 15, 3, 2, 7, 1, 8, 0, 4};
        int pos;

        // Arrays.binarySearch(a, key); 
        // verifica se o array "a" contem o valor "key" e retorna o indice do valor no array, se indice<0 entao "key" nao está em "a";
        // obs: o array precisa obrigatoriamente estar ordenado, use o metodo sort;

        Arrays.sort(n);
        pos = Arrays.binarySearch(n, 9);
        System.out.printf("\n%d\n", pos);

        for(int c:n){
            System.out.printf("%d ", c);
        }
        System.out.println();
    }
}
