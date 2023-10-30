package ReinoAnimal;

import java.util.Date;

public class Animal {
	private String espécie;
	private String sexo;
	private Date dataNascimento;
	
	int contador;
	
	public void comer() {
		System.out.println("O animal está comendo");
	}
	public String perfil(String espécie, String sexo, Date dataNascimento) {
		return espécie, sexo, dataNascimento;
	
	}
	private void name() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getEspécie() {
		return espécie;
	}
	public void setEspécie(String espécie) {
		this.espécie = espécie;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getContador() {
		return contador;
	}
	private void setContador(int contador) {
		this.contador = contador;
	}

}
