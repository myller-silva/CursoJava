public class Main{
    public static void main(String[] args) {
        try{
            int[] vetor = new int[3];
            vetor[3] = 10; //o erro ta aqui, o vetor tem apenas os indices 0, 1, 2
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro ao acessar indice inexistente no vetor");
        }
    }
}