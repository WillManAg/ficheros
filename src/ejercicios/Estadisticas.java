package ejercicios;

public class Estadisticas {
	
	private double media;
	private int suma;
	
	public Estadisticas(double media, int suma) {

		this.media = media;
		this.suma = suma;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	public int getSuma() {
		return suma;
	}
	public void setSuma(int suma) {
		this.suma = suma;
	}
	@Override
	public String toString() {
		return "Estadisticas [media=" + media + ", suma=" + suma + "]";
	}
	
	

}
