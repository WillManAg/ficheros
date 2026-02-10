package ejercicios;

import java.io.IOException;

public class Ejercicio2 {
	public static void main(String[] args){
		
		Estadisticas hola = null;

			// calculamos la media
			try {
				hola = UtilEj2.calcularMedia("notas.txt");
				System.out.println("La media es: " + hola.getMedia());
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			// creamos el fichero en el que la nota es mayor a la media
			try {
				UtilEj2.crearFicheroMayorMedia("notas.txt", hola.getMedia(), "mayormedia.txt");
				System.out.println("La suma total es: " + hola.getSuma());
			} catch (IOException e) {

				e.printStackTrace();
			}


		
			
			
	}
}