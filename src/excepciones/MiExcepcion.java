package excepciones;

public class MiExcepcion extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int codigoError;
	public MiExcepcion(String mensaje, int codigo) {
		super(mensaje);
		this.codigoError=codigo;
	}
	
	public String getMessage() {
		return "Código error: " + this.codigoError + super.getMessage();
	}
	
	
}
