package caracter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class CopyNoSpaces {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("xanadu.txt"));
            outputStream = new PrintWriter(new FileWriter("prueba.txt"));

            String l;
            String vocales = "aeiouAEIOU";

            while ((l = inputStream.readLine()) != null) {

                String ln = "";
                
                for (int i = 0; i < l.length(); i++) {
                    char actual = l.charAt(i);
                    
                    if (vocales.indexOf(actual) != -1) {

                        ln += actual;
                    } else {

                        ln += ' ';
                    }
                }
                
                outputStream.println(ln);
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