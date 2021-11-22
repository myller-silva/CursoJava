package excecoes;

import java.io.EOFException;
import java.io.IOException;

public class PropagacaoException {
	
	public void teste2(int numero) throws IOException {
		try {
			throw new IOException();
		} catch (IOException e) {
			// tratamento parcial
			e.printStackTrace();
			// relançamento
			throw e;
		}
	}
	
	public void teste(int numero) throws EOFException,
		IOException {
			switch (numero) {
				case 1: throw new NumberFormatException();
				case 2: throw new EOFException();
				case 3: throw new IOException();
				default: throw new NullPointerException();
			}
	}
	
	/*public void teste(int numero) throws IOException {
		try { // 1
			try { // 2
				try { // 3
					switch (numero) {
						case 1: throw new NumberFormatException();
						case 2: throw new EOFException();
						case 3: throw new IOException();
						default: throw new NullPointerException();
					}
				} catch (EOFException e) {}
			} catch (NullPointerException e) {}
		} catch (NumberFormatException e) {}
	}*/
	
	/*public void teste(int numero) {
		try { // 1
			try { // 2
				try { // 3
					switch (numero) {
						case 1: throw new NumberFormatException();
						case 2: throw new EOFException();
						case 3: throw new IOException();
						default: throw new NullPointerException();
					}
				} catch (EOFException e) {}
			} catch (IOException e) {}
		} catch (NumberFormatException e) {}
	}*/
	
	/*public void teste(int numero) {
		try { // 1
			try { // 2
				try { // 3
					switch (numero) {
						case 1: throw new NumberFormatException();
						case 2: throw new EOFException();
						case 3: throw new IOException();
						default: throw new NullPointerException();
					}
				} catch (EOFException e) {}
			} catch (NullPointerException e) {}
		} catch (NumberFormatException e) {}
	}*/

}
