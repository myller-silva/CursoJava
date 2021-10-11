public class Cap3_13 {
    public static void main(String[] args){
        // 1
        // for(int c=150; c<=300; c++){
        //     System.out.printf("%d ", c);
        // }
        // System.out.println();

        // 2
        // int somatorio=0;
        // for(int c=1; c<5; c++){
        //     somatorio+=c;
        //     System.out.println(somatorio);
        // }

        // 3
        // for(int c=0; c<100; c++){
        //     if(c%3==0){
        //         System.out.println(c);
        //     }     
        // }

        4
        for(int c=1; c<10; c++){
            int fatorial=1;
            System.out.printf("\n%d! = ", c);
            for(int i=c; i>=1; i--){
                fatorial *= i;
            }
            for(int i=c; i>=1; i--){
                System.out.printf("%d", i);
                if(i>1){
                    System.out.printf(" x ");
                }else{
                    System.out.printf(" = ");
                }
            }
            System.out.println(fatorial);
        }


    }
}
