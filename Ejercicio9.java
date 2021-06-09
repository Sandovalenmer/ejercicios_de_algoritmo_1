import java.util.*;

public class Ejercicio9{
	public static void main(String[] args){
		String palabra1, palabra2, interc;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese la primer palabra");
		palabra1 = scanner.next();
		System.out.println("Ingrese una segunda palabra");
		palabra2 = scanner.next();

		interc = palabra1;	
		palabra1 = palabra2;
		palabra2 = interc;

		System.out.println(palabra1+" y "+palabra2);
	}
}