public class Main {
    public static void main(String[] args) {
        int a=8, b=7, c=4, d=13, e=76, f=24 ;
        
        exibirVetor(a );
        exibirVetor(a, b );
        exibirVetor(a, b, c );
        exibirVetor(a, b, c, d);
        exibirVetor(a, b, c, d, e);
        exibirVetor(a, b, c, d, e, f);

    }

    public static void exibirVetor(int... v){
        for(int i=0; i<v.length; i++){
            System.out.printf("%d ", v[i]);
        }
        System.out.println();
    }
}
