package ReinoAnimal;
/**
 * classe responsável por gerar um animal aereo
 * 
 * @author 20201064010039
 *
 */

public class Aereo extends Animal{
	private String altitude;
	
	/**
	 * Metódo que diz que o animal aereo está voar
	 */
	public void voar() {
		System.out.println("O animal está voando");
	}
	
	/**
	 * Metódo que diz que o animal aereo está comendo
	 */
	public void comer() {
		System.out.println("O animal ar está comendo");
	}
	/**
	 * Metódo que diz o perfil do animal aereo
	 */
	public void perfil() {
		System.out.println( "altitude" + this.altitude + "especie" + this.getEspecie() + "sexo" + this.getSexo() + "data" + this.getDataNascimento());
	}

	public String getAltitude() {
		return altitude;
	}

	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}

}
