package excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoCerrado {

	public static void mostrarFicheroB() {
		String linea;
		
		try (BufferedReader fichero = new BufferedReader(new FileReader("uwu.txt"))){
			linea = fichero.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = fichero.readLine();
			}
		} catch(IOException e) {
			System.err.println("Error en entrada salida fichero");
		}


	}

}
  