package ReinoAnimal;
/**
 * classe responsável por gerar um animal aquatico
 * 
 * @author 20201064010039
 *
 */

public class Aquatico extends Animal{
	private String tipoagua;
	private boolean escamas;
	
	/**
	 * Metódo que diz que o animal aquatico está comendo
	 */
	public void comer() {
		System.out.println("O animal está aquatico esta comendo...");
		
	}

	/**
	 * Metódo que diz que o animal aquatico está nadando
	 */
	public void nadar() {
		System.out.println("O animal está nadando...");
		
	}	
	/**
	 * Metódo que diz o perfil do animal aquatico
	 */
	public void perfil() {
		System.out.println( "| escamas" + escamas+ "| tipo agua" + this.tipoagua + "especie" + this.getEspecie() + "| sexo" + this.getSexo() + "| data nasc" + this.getDataNascimento());
	
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
