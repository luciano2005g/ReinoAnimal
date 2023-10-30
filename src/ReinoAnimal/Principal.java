package ReinoAnimal;

public class Principal {

	public static void main(String[] args) {
		Aquatico a1 = new Aquatico();
		a1.setEspecie(" Carcharias taurus");
		a1.setSexo("femea");
		a1.setDataNascimento("7");
		a1.setTipoagua("salgada");
		a1.setEscamas(true);
		
		Aquatico a2 = new Aquatico();
		a2.setEspecie(" Pygocentrus nattereri");
		a2.setSexo("macho");
		a2.setDataNascimento("3");
		a2.setTipoagua("doce");
		a2.setEscamas(true);
		
		
		
		Terrestre b1 = new Terrestre();
		b1.setEspecie(null);
		b1.setSexo("femea");
		a2.setDataNascimento("7");
		
	}
}
