package codigofontedaaula;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class ExemploArrayListComIterator {
	
	public static void main(String[] args) throws ParseException {
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Pessoa p1 = new Pessoa("Maria",sdf.parse("10/06/2006"));
		Pessoa p2 = new Pessoa("Jo�o",sdf.parse("15/09/2000"));
		listaPessoas.add(p1); listaPessoas.add(p2);  
		Iterator<Pessoa> itr = listaPessoas.iterator();
		while (itr.hasNext()) {
			Pessoa p = itr.next();
			System.out.println(p.getNome());
		}
	}
}
