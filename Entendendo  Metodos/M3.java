public class M3 {
    public static void main(String[] args){

        System.out.println( soma(3, 6, 10, 4) );
        
        int[] vec={9, 5, 4};
        System.out.println( soma(vec) );        
    }

    public static int soma( int... nums ){
        int res=0;
        for( int v:nums ){
            res += v;
        }
        return res;
    }
}
