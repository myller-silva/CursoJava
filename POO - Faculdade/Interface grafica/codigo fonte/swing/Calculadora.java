package swing;

public class Calculadora {
	public int mdc(int x, int y) {
		while (x!=y) {
			if (x>y)
				x = x - y;
			else {
				int aux = x;
				x = y;
				y = aux;
			}
		}
		return x;
	}
}
