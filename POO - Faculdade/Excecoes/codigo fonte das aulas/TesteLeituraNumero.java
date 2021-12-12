package excecoes;
import java.util.Scanner;
public class TesteLeituraNumero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean ok = false;
		while (ok==false) {
			System.out.println("Informe um número:");
			try {
				int numero = Integer.parseInt(sc.nextLine());
				System.out.println("Número informado: "+numero);
				ok = true;
			} catch(Exception e) {
				System.out.println("Você não forneceu um número!");
			}
		}
		sc.close();
	}
}
