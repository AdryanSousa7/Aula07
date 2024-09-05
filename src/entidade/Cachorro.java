package entidade;

public class Cachorro extends Animal{
	public String EmitirSom() {
		return super.EmitirSom() + "Au-Au";
	}
}
