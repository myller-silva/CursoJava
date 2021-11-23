public class Main {

    public static void main(String[] args) {
        
        try{
            lancarUmaException();
            System.out.println("Essa mensagem nao sera impressa");
        }catch(Exception e){
            System.out.println("Erro");
        }
        
    }
    public static void lancarUmaException() throws Exception {
        throw new Exception(); //toda vez que esse metodo for chamado irá lançar(throw) uma exceção do tipo Exception
    }
}
