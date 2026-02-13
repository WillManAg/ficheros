package rpg.exepciones;

public class Mago {

	private int manaActual = 20;
	
	public void lanzarBolaFuego(int coste) throws ManaException {
		if (coste > manaActual) {
			throw new ManaException ("No tienes maná suficiente", (coste - manaActual));
		}
		
		manaActual -= coste;
		System.out.println("¡Bola de fuego lanzada!");
	}
	
	
}
