package codigofontedaaula;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;
public class ExemploHashSet {
	public static void main(String[] args) throws ParseException {
		Set<Pessoa> conjuntoPessoas = new HashSet<Pessoa>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Pessoa p1 = new Pessoa("Maria",sdf.parse("10/06/2006"));
		Pessoa p2 = new Pessoa("Maria",sdf.parse("15/09/2000"));
		conjuntoPessoas.add(p1); conjuntoPessoas.add(p2);
		System.out.println(conjuntoPessoas);
	}
}
