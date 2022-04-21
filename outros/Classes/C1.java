public class C1{
    public static void main(String[] args) {
        //  tipo: Jogador, nome: j1,  valor: new Jogador()
        // o "new" é o responsavel pela instanciação, ou seja, ele aloca a memoria dinamica(heap) necessaria para o objeto

        int num=0;
        Jogador j1 = new Jogador(++num);
        Jogador j2 = new Jogador(++num);
        Jogador j3 = new Jogador(++num);

        // j1.num = 5; 
        // j2.num = 10;
        // j3.num = 15;
        // System.out.printf("%d %d %d\n", j1.num, j2.num, j3.num);
    }
}