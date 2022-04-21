public class Jogo{
    public static void main(String[] args) {
        int num=0;
        Jogador j1 = new Jogador(++num);
        Jogador j2 = new Jogador(++num);
        Jogador j3 = new Jogador(++num);

        // j1.setVidas(4);
        // j2.setVidas(5);
        // j3.setVidas(6);

        j1.addVidas();
        j1.addVidas();
        j1.addVidas();
        j1.addVidas();
        
        System.out.printf("Vidas do jogador 1: %d\n", j1.getVidas());
        System.out.printf("Vidas do jogador 2: %d\n", j2.getVidas());
        System.out.printf("Vidas do jogador 3: %d\n", j3.getVidas());
    }
}