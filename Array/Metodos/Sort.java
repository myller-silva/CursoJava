import java.util.Arrays;

public class Sort{
    public static void main(String[] args){
        int[] num = {9, 6, 4, 7, 2, 1, 3, 0, 5, 8};
        
        System.out.print("\nArray:\t\t");
        for(int c=0; c<num.length; c++){
            System.out.printf("%d ", num[c]);
        }
        
        Arrays.sort(num);       //metodo de ordenacao

        System.out.print("\n\nOrdenado:\t");
        for(int c:num){                         //loop especifico para ler Arrays
            System.out.printf("%d ", c);
        }
        System.out.println("\n");
    }
}
