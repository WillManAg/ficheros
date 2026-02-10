package excepciones;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		try {
			Delegar.mostrarFicheroA();
		} catch (IOException e) {
			
			System.err.println("Error mostrando ficheros uwu");
			e.printStackTrace();
		}

	}

}
