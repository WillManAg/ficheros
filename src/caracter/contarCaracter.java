package caracter;

import java.io.FileReader;
import java.io.IOException;

public class contarCaracter {
    public static void main(String[] args) throws IOException {
    	
        FileReader inputStream = null;
        
        try {
            inputStream = new FileReader("xanadu.txt");
            int c;
            int contador = 0;

            while ((c = inputStream.read()) != -1) {
                contador++;
            }
            
            System.out.println("Hay " + contador + " caracteres");
            
        } finally {
        	if (inputStream != null) {
                inputStream.close();
            }
        }
    }
}