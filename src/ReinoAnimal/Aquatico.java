package ReinoAnimal;

public class Aquatico extends Animal{
	private String tipoagua;
	private boolean escamas;
	
	public void comer() {
		System.out.println("O animal está aquatico esta comendo...");
		
	}

	public void nadar() {
		System.out.println("O animal está nadando...");
		
	}	
	
	
	public String getTipoagua() {
		return tipoagua;
	}

	public void setTipoagua(String tipoagua) {
		this.tipoagua = tipoagua;
	}

	public boolean isEscamas() {
		return escamas;
	}

	public void setEscamas(boolean escamas) {
		this.escamas = escamas;
	}


	
}
