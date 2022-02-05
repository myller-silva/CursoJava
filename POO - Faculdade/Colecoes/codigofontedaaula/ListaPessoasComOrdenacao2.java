package codigofontedaaula;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaPessoasComOrdenacao2 {

	public static void main(String[] args) throws ParseException {
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Pessoa p1 = new Pessoa("Maria",sdf.parse("10/06/2006"));
		Pessoa p2 = new Pessoa("Jo�o",sdf.parse("15/09/2000"));
		listaPessoas.add(p1); listaPessoas.add(p2); 
		System.out.println(listaPessoas);
		Collections.sort(listaPessoas);
		System.out.println(listaPessoas);
	}
}

/*public class ListaPessoasComOrdenacao2 {
	
	public static void main(String[] args) throws ParseException {
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Pessoa p1 = new Pessoa("Maria",sdf.parse("10/06/2006"));
		Pessoa p2 = new Pessoa("Jo�o",sdf.parse("15/09/2000"));
		listaPessoas.add(p1); listaPessoas.add(p2); 
		System.out.println(listaPessoas);
	}
}*/

