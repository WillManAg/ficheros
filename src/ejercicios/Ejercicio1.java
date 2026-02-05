package ejercicios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        PrintWriter outputStream = null;

        try {

            outputStream = new PrintWriter(new FileWriter("notas.txt"));

            System.out.println("Introduce numeros. Con un negativo terminas");

            while (true) {
                System.out.print("Nota: ");
                int nota = teclado.nextInt();


                if (nota < 0) {
                    break;
                }


                outputStream.println(nota);
            }

            System.out.println("Fichero de notas creado.");

        } finally {

            teclado.close();
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}