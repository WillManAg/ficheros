package ejercicio6y7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Extractor {
    public static void main(String[] args) {
    
    	try (BufferedReader pagina = new BufferedReader(new FileReader("pagina.html"));
             PrintWriter imagen = new PrintWriter(new FileWriter("imagenes.txt"))){
    		
    		String linea;
    		String buscado = "<img src=\"";
    		
    		while ((linea = pagina.readLine()) != null) {
    			
    			String codigo = linea.trim();
    			
    			if (codigo.startsWith(buscado)) {
    				// se puede 'empezar desde' (segunda opcion)
    				int cierre = codigo.indexOf("\"", 10);
    				
    				if (cierre != -1) {
    					
    					String img = codigo.substring(10, cierre);
    					
    					if (img.toLowerCase().endsWith("png")) {
    						imagen.println(img);
    					}
    					
    				}
        			
    			}
    			
    		}
    		
    	} catch (IOException e) {
    		System.out.println("Error con el fichero: " + e.getMessage());
    	}
    	
    }
}
