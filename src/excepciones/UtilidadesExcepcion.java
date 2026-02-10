package excepciones;

public class UtilidadesExcepcion {

	public static void metodo(int numero) throws MiExcepcion {
		
		if (numero<0) {
			throw new MiExcepcion("Número negativo", 2);
		}
		
	}
	
}
