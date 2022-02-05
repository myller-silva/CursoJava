package q1;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        String nome;
        Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList<String>();
        List<String> naoLidosAnteriormente = new ArrayList<String>();
        
        System.out.println("PARTE 1");
        do{
            System.out.print("Digite uma string: ");
            nome = scanner.nextLine();
            if (nome.equals("fim")) break;
            lista.add(nome);
        }while(true);
        
        System.out.println("PARTE 2");
        do{
            System.out.print("Digite uma string: ");
            nome = scanner.nextLine();
            if (nome.equals("fim")) break;
            if(lista.indexOf(nome)==-1) naoLidosAnteriormente.add(nome);
        }while(true);
        
        System.out.println("\nPrimeira leitura:" + lista);
        System.out.println("Nao lidos anteriormente:" + naoLidosAnteriormente);

        scanner.close();
    }
}
