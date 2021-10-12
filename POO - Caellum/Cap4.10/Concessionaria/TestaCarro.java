public class TestaCarro {
    public static void main(String[] args){
        Carro meu_carro = new Carro();
        meu_carro.cor = "preto";
        meu_carro.modelo = "mustang";
        meu_carro.velocidade_atual = 0;
        // meu_carro.velocidade_maxima = 120;

        System.out.printf( "\nVelocidade: %.2f\n", meu_carro.velocidade_atual );
        System.out.printf( "Marcha: %d\n", meu_carro.pega_marcha() );
        for(int c=0; c<5; c++){
            meu_carro.acelerar(50);
            System.out.printf( "\nVelocidade: %.2f\n", meu_carro.velocidade_atual );
            System.out.printf( "Marcha: %d\n", meu_carro.pega_marcha() );
        }  
    }
}
