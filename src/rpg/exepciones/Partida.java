package rpg.exepciones;

public class Partida {

	public static void main(String[] args) {
		
		Mago merlin = new Mago();
		
		try {
			System.out.println("Lanzamos bola de fuego");
			merlin.lanzarBolaFuego(50);
		} catch (ManaException e){
			System.err.println(e.getMessage());
		}

		System.out.println("Seguimos la partida");
	}

}
