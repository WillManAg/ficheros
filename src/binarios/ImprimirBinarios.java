package binarios;

import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.EOFException;

public class ImprimirBinarios {
    public static void main(String[] args) {

        try (DataInputStream fichero = new DataInputStream(new 
                BufferedInputStream(new FileInputStream("numeros.dat")))) {
            
            System.out.println("El fichero tiene:");
            
            int contador = 1;

            while (true) {
                double num = fichero.readDouble();
                System.out.println("El número " + contador + " es: " + num);
                contador++;
            }

        } catch (EOFException e) {
            System.out.println("No hay más números");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}