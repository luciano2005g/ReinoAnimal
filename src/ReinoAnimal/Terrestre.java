package ReinoAnimal;

/**
 * classe responsável por gerar um animal terrestre
 * 
 * @author 20201064010039
 *
 */

public class Terrestre extends Animal{
	String regiao;
	boolean pelagem;
	
	/**
	 * Metódo que diz que o animal terrestre está se movendo
	 */
	public void mover() {
		System.out.println("O animal está se movendo");
	}
	/**
	 * Metódo que diz que o animal terrestre está se comendo
	 */
	public void comer() {
		System.out.println("O animal terrestre está comendo...");
	}
	/**
	 * Metódo que diz o perfil do animal terrestre 
	 */
	public void perfil() {
		System.out.println( "regiao" + this.regiao + "especie" + this.getEspecie() + "| sexo" + this.getSexo() + "| data nasc" + this.getDataNascimento());
	
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public boolean isPelagem() {
		return pelagem;
	}

	public void setPelagem(boolean pelagem) {
		this.pelagem = pelagem;
	}
	
	

}
