package excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Utilidades {

	public static void mostrarFichero( ) {
		
		try {
			
			BufferedReader fichero = new BufferedReader(new FileReader("uwu.txt"));
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
}
