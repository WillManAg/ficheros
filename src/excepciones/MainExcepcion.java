package excepciones;

public class MainExcepcion {

	public static void main(String[] args) {

		try {
			UtilidadesExcepcion.metodo(-2);
		} catch (MiExcepcion e) {
			System.err.println(e.getMessage());
		}

	}

}
