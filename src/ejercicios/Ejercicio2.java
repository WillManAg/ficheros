package ejercicios;

import java.io.IOException;

public class Ejercicio2 {
	public static void main(String[] args) throws IOException {

		Estadisticas hola;


			// calculamos la media
			hola = UtilEj2.calcularMedia("notas.txt");
			
			// creamos el fichero en el que la nota es mayor a la media
			UtilEj2.crearFicheroMayorMedia("notas.txt", hola.getMedia(), "mayormedia.txt");

			// Imprimimos
			
			System.out.println("La media es: " + hola.getMedia());
			System.out.println("La suma total es: " + hola.getSuma());
			
	}
}