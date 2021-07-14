public class Sobrecarga {
    public static void main(String[] args) {
        int      s1 = 0 ;
        double   s2 = 0.0 ;
        int      s3 = 0 ;
        double   s4 = 0.0 ;

        int[]    a1 = { 8, 9, 4 } ;
        double[] a2 = { 8.7, 9.3, 4.2 } ;

        s1 = soma( 2, 5 );
        s2 = soma( 2.3, 5.2 );
        s3 = soma( a1 );
        s4 = soma( a2 );

        System.out.println( s1 );
        System.out.println( s2 );
        System.out.println( s3 );
        System.out.println( s4 );
    }
    public static int soma (int a, int b){
        int res=0;
        res = a+b;
        return res;
    }
    public static double soma (double a, double b){  
        double res=0;
        res = a+b;
        return res;
    }
    public static int soma (int ... a){
        int res=0;
        for( int v:a ){
            res += v;
        }
        return res;
    }
    public static double soma (double ... a){
        double res=0;
        for( double v:a ){
            res += v;
        }
        return res;
    }
}