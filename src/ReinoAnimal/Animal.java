package ReinoAnimal;

/**
 * 
 * classe responsável por gerar um animal
 * 
 * @author 20201064010039
 *
 */
public class Animal {
	private String especie;
	private String sexo;
	private String dataNascimento;
	private static int contador;
	
	public Animal() {
		setContador();
	}

	/**
	 * Metódo que diz que o animal está comendo
	 */
	public void comer() {
		System.out.println("O animal está comendo...");
	}
	/**
	 * Metódo que mostra o perfíl do animal
	 */
	public void perfil() {
		System.out.println( "especie" + this.especie + "| sexo" + this.sexo + "| data nasc" + this.dataNascimento);
	
	}
	
	/**
	 * getters e setters
	 * @return
	 */
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public static int getContador() {
		return contador;
	}
	public static void setContador() {
		Animal.contador = Animal.contador + 1;
	}
	

}
