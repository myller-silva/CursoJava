public class Trem {
    Vagao vagoes[];
    Locomotiva locomotiva; 

    Trem (Locomotiva locomotiva, Vagao... vagoes ){
        this.locomotiva = locomotiva;

        if(vagoes.length>149){
            System.out.println("Quantidade de vagoes em excesso. \nSerao consideados apenas 150, incluindo a locomotiva.");
            for(int c=0; c<149; c++){ //tem forma melhor de fazer isso em java?
                this.vagoes[c] = vagoes[c];
            }
        }else{
            this.vagoes = vagoes; 
        }
        
    }

}

