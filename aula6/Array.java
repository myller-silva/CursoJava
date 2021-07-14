public class Array {
    public static void main(String[] args){
        final int tam=5;    //declaracao de constante

        int[] n=new int[tam];               //declaracao de array do tipo inteiro; por padrao, o java inicializa array de inteiros com zero
        int[] x={5, 3, 67, 5, 3};         //declaracao e inicializacao de array do tipo inteiro;  


        
        System.out.print("N: ");
        for(int c=0; c<tam; c++){
            System.out.printf("%d ", n[c]);
        }
        System.out.println();       
        
        System.out.print("X: ");
        for(int c=0; c<n.length; c++){      //length é um atributo que retorna um inteiro reflerente ao tamanho do array de inteiros
            System.out.printf("%d ", x[c]);
        }
        
        // continua...
    }
}
