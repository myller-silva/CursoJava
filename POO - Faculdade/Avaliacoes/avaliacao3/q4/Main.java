package q4;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        String nome;

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %dº nome: ", i+1);
            nome = scan.nextLine(); 
            lista.add(nome);
        }
        Collections.sort(lista);
        
		Iterator<String> itr = lista.iterator();

        System.out.print("Lista ordenada: ");
		while (itr.hasNext()) {
			nome = itr.next();
			System.out.printf("%s ", nome);
		}
        scan.close();
    }
}