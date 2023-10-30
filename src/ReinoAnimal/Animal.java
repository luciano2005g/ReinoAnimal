package ReinoAnimal;


public class Animal {
	private String especie;
	private String sexo;
	private String dataNascimento;
	private static int contador;
	
	public Animal() {
		setContador();
	}

	public void comer() {
		System.out.println("O animal está comendo...");
	}
	public void perfil() {
		System.out.println( "especie" + this.especie + "| especie" + this.sexo + "| data nasc" + this.dataNascimento);
	
	}
	
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String espécie) {
		this.especie = espécie;
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
