package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class UtilEj2 {

	public static Estadisticas calcularMedia(String nombre) throws IOException {

		BufferedReader ficheroNotas = null;
		String linea;
		int suma, contador;
		double media = -1;

		try {
			ficheroNotas = new BufferedReader(new FileReader(nombre));

			contador = 0;
			suma = 0;

			while ((linea = ficheroNotas.readLine()) != null) {

				if (!linea.isEmpty()) {
					suma += Integer.parseInt(linea);
					contador++;
				}

			}

			if (contador != 0) {
				media = ((double) suma) / contador;
			}

		} finally {
			if (ficheroNotas != null) {
				ficheroNotas.close();
			}
		}

		Estadisticas hola = new Estadisticas(media, suma);

		return hola;

	}

	public static void crearFicheroMayorMedia(String nombreFichero, double media, String nombreCrear)
			throws IOException {

		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		String l;

		if (media != -1) {

			try {
				inputStream = new BufferedReader(new FileReader("notas.txt"));
				outputStream = new PrintWriter(new FileWriter("mayormedia.txt"));

				while ((l = inputStream.readLine()) != null) {

					if (!l.isEmpty()) {
						if (Double.parseDouble(l) > media) {
							outputStream.println(l);
						}
					}

				}
			} finally {
				if (inputStream != null) {
					inputStream.close();
				}
				if (outputStream != null) {
					outputStream.close();
				}
			}

		}
	}
}
