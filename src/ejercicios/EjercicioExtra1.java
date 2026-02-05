package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EjercicioExtra1 {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);
        
        BufferedReader ficheroNotas = null;
        String linea;
        boolean encontrado = false;

        try {

            System.out.print("Buscar nota: ");
            int notaBuscada = teclado.nextInt();


            ficheroNotas = new BufferedReader(new FileReader("notas.txt"));


            while ((linea = ficheroNotas.readLine()) != null && !encontrado) {
                
                if (!linea.isEmpty()) {

                    int notaActual = Integer.parseInt(linea);
                    
                    if (notaActual == notaBuscada) {
                        encontrado = true;
                    }
                }
            }


            if (encontrado) {
                System.out.println("La nota " + notaBuscada + " si está.");
            } else {
                System.out.println("La nota " + notaBuscada + " no está1.");
            }

        } finally {

            if (ficheroNotas != null) {
                ficheroNotas.close();
            }

            teclado.close();
        }
    }
}