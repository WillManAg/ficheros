package binarios;

import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class GuardarBinarios {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        try (DataOutputStream fichero = new DataOutputStream(new 
        		BufferedOutputStream (new FileOutputStream("numeros.dat")))) {
            
            System.out.println("Vas a introducir 10 números reales:");

            for (int i = 1; i <= 10; i++) {
                System.out.print("Introduce el número " + i + ": ");
                double num = teclado.nextDouble();
                
                fichero.writeDouble(num);
            }

            System.out.println("Fichero ready");

        } catch (IOException e) {
            System.out.println("Saltó un errror: " + e.getMessage());
        }
        teclado.close();
    }
}