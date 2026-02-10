package excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Utilidades {

	public static void mostrarFichero() {
		String linea;
		BufferedReader fichero = null;
		
		try {
			
			fichero = new BufferedReader(new FileReader("uwu.txt"));
			linea = fichero.readLine();
			
			while(linea!=null) {
				System.out.println(linea);
				linea=fichero.readLine();
			}
			
		} catch (FileNotFoundException e) {
			
			System.err.println("E: Fichero no encontrado cuando intentaba mostrarlo");
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
			System.out.println("");
		} finally {
			if (fichero != null) {
				try {
					fichero.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
		
	}
}
