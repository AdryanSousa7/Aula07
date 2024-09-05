package principal;
import entidade.Gato;
import entidade.Vaca;
import entidade.Cachorro;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner adr = new Scanner(System.in);
		
		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();
		Vaca vaca = new Vaca();
		
		System.out.println(cachorro.EmitirSom());
		System.out.println(gato.EmitirSom());
		System.out.println(vaca.EmitirSom());
 }
}