package aula3;
public class Ternario {
    public static void main(String[] args){
        int nota=10;
        int media=7;
        String res;
        res =   ( nota>=media )? ("Aprovado") :
                ( nota>=4 )    ? ("Recuperacao") : ("Reprovado") ;
        System.out.println("Resultado: " + res);
        // System.out.printf("Resultado: %s\n", res);
    }
}