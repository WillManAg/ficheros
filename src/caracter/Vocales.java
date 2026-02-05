package caracter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class Vocales {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("xanadu.txt"));
            outputStream = new PrintWriter(new FileWriter("prueba.txt"));

            String l;
            int lineas = 1;
            String vocales = "aeiouAEIOU";

            while ((l = inputStream.readLine()) != null) {
                int contador = 0;
                
                for (int i = 0; i < l.length(); i++) {
                    if (vocales.indexOf(l.charAt(i)) != -1) {
                        contador++;
                    }
                }
                
                System.out.println("En la linea " + lineas + " hay " + contador + " vocales");
                lineas++;
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