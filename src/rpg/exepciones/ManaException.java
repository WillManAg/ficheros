package rpg.exepciones;

public class ManaException extends Exception {

	private int manaFaltante;
	
	public ManaException(String mensaje, int manaFaltante) {
		super (mensaje);
		this.manaFaltante = manaFaltante;
	}
	
	@Override
	public String getMessage() {
		return super.getMessage() + " (Falta " + this.manaFaltante + " puntos de mana).";
	}
}
