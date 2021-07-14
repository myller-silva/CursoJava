package aula3;
public class SeEntao {
    public static void main(String[] args){
        int nota=10;
        int media=7;

        if(nota>=media){
            System.out.println("Aprovado");
        }else if (nota>=4){
            System.out.println("Recuperacao");   
        }else{
            System.out.println("Reprovado");
        }
    }
}
