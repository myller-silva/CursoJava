package construtores;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteAnimal {

	public static void main(String[] args) throws ParseException {
		
		// Formatador de datas
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		// construtor 1
		Animal a1 = new Animal();
		a1.setEspecie("Cachorro");
		a1.setSexo('m');
		a1.setNome("Rex");
		Date dA1 = sdf.parse("02/03/2018");
		a1.setDataDeNascimento(dA1);
		
		// construtor 2
		Animal a2 = new Animal("Cachorro",'m');
		
		
		// construtor 3
		Animal a3 = new Animal("Cachorro",'m',"Rex",
				sdf.parse("02/03/2018"));
		
	}

}
