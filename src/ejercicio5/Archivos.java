package ejercicio5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Archivos {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String palabraMasLarga = "";

        try (PrintWriter archivo = new PrintWriter(new FileWriter("palabras.txt"))) {
            System.out.println("Introduce palabras ('exit' para terminar):");
            while (true) {
                System.out.print("Palabra: ");
                String palabra = teclado.nextLine();
                if (palabra.equalsIgnoreCase("exit")) break;
                archivo.println(palabra);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader archivo = new BufferedReader(new FileReader("palabras.txt"));
             PrintWriter palindromo = new PrintWriter(new FileWriter("palindromos.txt"))) {

            String linea;
            while ((linea = archivo.readLine()) != null) {

                String palabra = linea.trim();

                if (palabra.length() > palabraMasLarga.length()) {
                    palabraMasLarga = palabra;
                }


                if (Utilidades.esPalindromo(palabra)) {
                    palindromo.println(palabra);
                }
            }

            if (!palabraMasLarga.isEmpty()) {
                System.out.println("La palabra más larga es: " + palabraMasLarga);
            } else {
                System.out.println("No hay palabras");
            }
            System.out.println("Se ha creado 'palindromos.txt'");

        } catch (IOException e) {
            System.out.println("Error con el fichero: " + e.getMessage());
        }
        teclado.close();
    }
}
