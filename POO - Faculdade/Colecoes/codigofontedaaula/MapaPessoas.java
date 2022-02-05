package codigofontedaaula;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapaPessoas {
	public static void main(String[] args) throws ParseException {
		Map<String,Pessoa> mapaPessoas =
				new TreeMap<String,Pessoa>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Pessoa p1 = new Pessoa("Maria","000-000-000-00",sdf.parse("10/06/2006"));
		Pessoa p2 = new Pessoa("Jo�o","000-000-000-11",sdf.parse("15/09/2000"));
		mapaPessoas.put(p1.getCpf(),p1);
		mapaPessoas.put(p2.getCpf(),p1); 
		System.out.println(mapaPessoas);
		System.out.println(mapaPessoas.get(p1.getCpf()));
		System.out.println(mapaPessoas.get(p2.getCpf()));
		mapaPessoas.remove(p2.getCpf());
		System.out.println(mapaPessoas);
	}
}
/*public class MapaPessoas {
	public static void main(String[] args) throws ParseException {
		Map<String,Pessoa> mapaPessoas =
				new TreeMap<String,Pessoa>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Pessoa p1 = new Pessoa("Maria","000-000-000-00",sdf.parse("10/06/2006"));
		Pessoa p2 = new Pessoa("Jo�o","000-000-000-11",sdf.parse("15/09/2000"));
		mapaPessoas.put(p1.getCpf(),p1);
		mapaPessoas.put(p1.getCpf(),p2); 
		System.out.println(mapaPessoas);
		System.out.println(mapaPessoas.get(p1.getCpf()));
		System.out.println(mapaPessoas.get(p2.getCpf()));
		mapaPessoas.remove(p2.getCpf());
		System.out.println(mapaPessoas);
	}
}*/

/*public class MapaPessoas {
	public static void main(String[] args) throws ParseException {
		Map<String,Pessoa> mapaPessoas =
				new TreeMap<String,Pessoa>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Pessoa p1 = new Pessoa("Maria","000-000-000-00",sdf.parse("10/06/2006"));
		Pessoa p2 = new Pessoa("Jo�o","000-000-000-11",sdf.parse("15/09/2000"));
		mapaPessoas.put(p1.getCpf(),p1);
		mapaPessoas.put(p2.getCpf(),p2); 
		System.out.println(mapaPessoas);
		System.out.println(mapaPessoas.get(p1.getCpf()));
		System.out.println(mapaPessoas.get(p2.getCpf()));
		mapaPessoas.remove(p2.getCpf());
		System.out.println(mapaPessoas);
	}
}*/

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

