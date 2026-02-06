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

	public static boolean buscarNota(String nota, String notaBuscada) throws IOException {

		BufferedReader fichero = null;
		String linea, notaActual;
		boolean encontrado = false;

		try {

			fichero = new BufferedReader(new FileReader(nota));

			while ((linea = fichero.readLine()) != null && !encontrado) {

				if (!linea.isEmpty()) {

					notaActual = linea;

					if (notaActual.equals(notaBuscada)) {
						encontrado = true;
					}
				}
			}

		} finally {
			if (fichero != null) {
				fichero.close();
			}
		}

		return encontrado;
	}

	public static void buscarNotaExtra(String nota, String notaBuscada) throws IOException {

		BufferedReader fichero = null;
		String linea, notaActual,notaSiguiente;

		try {

			fichero = new BufferedReader(new FileReader(nota));
			notaActual=null;
			notaSiguiente=null;
			while ((linea = fichero.readLine()) != null) {


					if (linea.equals(notaBuscada)) {
						
						notaSiguiente = fichero.readLine();
						break;
					}
			notaActual = linea;
				}

		} finally {
			if (fichero != null) {
				fichero.close();
			}
		}
		
		if (notaActual == null && notaSiguiente == null) {
			System.out.println("No hay nota anterior ni nota siguiente, " + linea + " es la única nota.");
		} else if (notaActual != null && notaSiguiente != null) {
			System.out.println("La nota anterior es: " + notaActual + " y la nota siguiente es: " + notaSiguiente);
		} else if (notaActual != null && notaSiguiente == null) {
			System.out.println("La nota anterior es: " + notaActual + " y no tiene nota siguiente");
		} else if (notaActual == null && notaSiguiente != null) {
			System.out.println("No hay nota anterior y la nota siguiente es: " + notaSiguiente);
		}
	}
	
	public static void crearFicheroMediaDeTres(String nota) throws IOException {
		
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		String uno, dos, tres;
		double media;
		
		if (!nota.isEmpty()) {
			
			try {
				inputStream = new BufferedReader(new FileReader(nota));
				outputStream = new PrintWriter(new FileWriter("mediaDeTres.txt"));
				
				while ((uno = inputStream.readLine()) != null) {
					
					dos = inputStream.readLine();
					
					tres = inputStream.readLine();
					
					media = (Double.parseDouble(uno) + Double.parseDouble(dos) + Double.parseDouble(tres)) / 3;
					
					outputStream.println(media);
					
				}
				
			} finally {
				if(inputStream != null) {
					inputStream.close();
				}
				if(outputStream != null) {
					outputStream.close();
				}
			}
			
		}
		
		
	}
	
}
