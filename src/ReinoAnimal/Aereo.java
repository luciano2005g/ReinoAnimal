package ReinoAnimal;

public class Aereo extends Animal{
	int altitude;
	
	public void voar() {
		System.out.println("O animal está voando");
	}
	 
	public void comer() {
		System.out.println("O animal ar está comendo");
	}
	
	public void perfil() {
		System.out.println( "altitude" + this.altitude + "especie" + this.getEspecie() + "sexo" + this.getSexo() + "data" + this.getDataNascimento());
	}

	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}

}
