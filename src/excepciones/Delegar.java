package excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Delegar {

	public static void mostrarFicheroA() throws IOException {
		String linea;
		BufferedReader fichero = null;

		fichero = new BufferedReader(new FileReader("uwu.txt"));
		linea = fichero.readLine();

		while (linea != null) {
			System.out.println(linea);
			linea = fichero.readLine();
		}

	}

}
  