package q5;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException{
		Scanner scan = new Scanner(System.in);
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
		String nome;
		int dia, mes, ano;

		for (int i = 0; i < 5; i++) {
			System.out.printf(">>> %dº pessoa\n", i+1);
			System.out.print("Nome: ");
			nome = scan.nextLine();
			System.out.print("Dia: ");
			dia = scan.nextInt();
            scan.nextLine();
			System.out.print("Mes: ");
			mes = scan.nextInt();
            scan.nextLine();
			System.out.print("Ano: ");
			ano = scan.nextInt();
            scan.nextLine();

			Pessoa p = new Pessoa( nome,sdf.parse( String.format("%d/%d/%d", dia, mes, ano) ) );
            listaPessoas.add(p);
		}
        
		Collections.sort(listaPessoas);
        
		Iterator<Pessoa> itr = listaPessoas.iterator();
        System.out.println();
		while (itr.hasNext()) {
			Pessoa p = itr.next();
			System.out.println("Nome:"+ p.getNome()+"\nData de nascimento:"+ p.getNascimento());
		}

        scan.close();
    }
}
