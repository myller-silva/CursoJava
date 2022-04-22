
import java.util.Scanner;

public class MainConsole {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe dois n�meros inteiros:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int mdc = calc.mdc(x, y);
		System.out.println("MDC: "+mdc);
		sc.close();
	}
}
