class Carro{
    String cor;
    String modelo;
    double velocidade_atual;
    private double velocidade_maxima=150;
    Motor motor;
    
    void ligar(){
        System.out.println("O carro está ligado");
    }

    void acelerar(double quantidade){
        double nova_velocidade = this.velocidade_atual + quantidade;

        if(nova_velocidade>velocidade_maxima){
            this.velocidade_atual = velocidade_maxima;
        }
        else{
            this.velocidade_atual = nova_velocidade;
        }
    }

    int pega_marcha(){
        if( this.velocidade_atual < 0 ){
            return -1;
        }
        if( this.velocidade_atual < 40 ){
            return 1;
        }
        if( this.velocidade_atual < 80){
            return 2;
        }
        return 3;
    }    
}

class Motor{
    int potencia;
    String tipo;
}