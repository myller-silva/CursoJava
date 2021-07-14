public class Jogador {
    private int num=0; // atributo
    private int vidas=0;

    public Jogador(int num){       //metodo construtor(deve ter o nome da classe)        
        // o operador "this" quer dizer que este "num" é o num da classe, o outro é o parametro de entrada
        this.num=num;
        this.vidas=3;
        System.out.printf("Jogador %d criado.\n", num);
    }
}
