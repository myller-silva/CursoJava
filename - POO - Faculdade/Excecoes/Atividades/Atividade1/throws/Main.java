import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try { 
            metodo();
        }catch (IOException e) {
            System.out.println("Erro");
        }        
    }
    public static void metodo() throws IOException {
        FileReader f = new FileReader("notExist.txt");        
    }    
}