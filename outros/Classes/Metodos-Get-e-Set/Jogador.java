public class Jogador {
    private final int maxVidas = 3;
    private int num=0;
    private int vidas=0;

    public Jogador(int num){
        this.num = num;
        this.vidas = 1 ;
        System.out.printf("Jogador %d criado.\n", this.num);
    }
    //Get: 
    public int getVidas(){
        return this.vidas;
    }
    //Set:
    // private void setVidas(int vidas){
    //     if( vidas > maxVidas ){
    //         this.vidas = maxVidas;
    //     }else if( vidas < 0 ){
    //         this.vidas = 0;
    //     }else{
    //         this.vidas = vidas;
    //     }
    // }
    public void addVidas(){
        if(this.vidas < maxVidas){
            this.vidas++;
        }
    }
}
