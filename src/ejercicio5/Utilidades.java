package ejercicio5;

public class Utilidades {
	
	public static boolean esPalindromo(String palabra) {

	    palabra = palabra.toLowerCase();
	    
	    int i = 0;
	    int j = palabra.length() - 1;
	    
	    while (i < j) {
	        if (palabra.charAt(i) != palabra.charAt(j)) {
	            return false; 
	        }
	        i++;
	        j--;
	    }
	    return true;
	}

}
