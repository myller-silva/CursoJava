public class Teste {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        p1.nome = "mac";
        p1.idade = 22;  

        int anos = 12;

        System.out.printf("%s tem %d anos.\n", p1.nome, p1.idade);
        for(int c=0; c<anos; c++){
            p1.fazAniversario();
        }
        System.out.printf("daqui %d anos tera %d", anos, p1.idade);
    }
}
