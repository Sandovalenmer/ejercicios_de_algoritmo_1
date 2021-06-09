import java.util.*;

public class Ejercicio2{

	public static void main(String[] args){
		String pais, capital;
		Scanner teclado = new Scanner(System.in);

		System.out.println("\n");
		System.out.println("Ingrese el País");
		pais = teclado.next();
		System.out.println("\n");
		System.out.println("Ingrese la capital del país");
		capital = teclado.next();
		System.out.println("\n");

		System.out.println(capital+", es la capital de: "+pais+".");
		

	}

}