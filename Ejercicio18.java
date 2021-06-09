import java.util.*;

public class Ejercicio18{

	public static void main(String[] args){
		int numero, d1, d2, d3, d4, suma;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el primer número");
		d1 = scanner.nextInt();
		System.out.println("Ingrese el segundo número");
		d2 = scanner.nextInt();
		System.out.println("Ingrese el tercer número");
		d3 = scanner.nextInt();
		System.out.println("Ingrese el cuarto número");
		d4 = scanner.nextInt();

		suma = d1+d2+d3+d4;
		System.out.println("N1: "+d1+", N2: "+d2+", N3: "+d3+", N4: "+d4+" Suma: "+suma);

	}
}