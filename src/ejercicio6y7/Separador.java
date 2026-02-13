package ejercicio6y7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Separador {
    public static void main(String[] args) {


        try (BufferedReader lista = new BufferedReader(new FileReader("alumnos.csv"));
             PrintWriter seleccion = new PrintWriter(new FileWriter("procesado.csv"))) {

            String linea;
            while ((linea = lista.readLine()) != null) {
                
            	// crea un arraylist de todas las partes eliminando la cola
                String[] partes = linea.split(",");

                // si partes no está vacía, dame la primera y la última
                if (partes.length > 0) {
                    String primero = partes[0];
                    String ultimo = partes[partes.length - 1];

                    // importante volver a escribirlo como csv
                    seleccion.println(primero + "," + ultimo);
                }
            }
            

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}