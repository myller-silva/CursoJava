package codigofontedaaula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaPessoasComOrdenacao {
	
	public static void main(String[] args) {
		List<String> listaPessoas = new ArrayList<String>();
		listaPessoas.add("Maria");
		listaPessoas.add("Jo�o");
		System.out.println(listaPessoas);
		Collections.sort(listaPessoas);
		System.out.println(listaPessoas);
	}
}
